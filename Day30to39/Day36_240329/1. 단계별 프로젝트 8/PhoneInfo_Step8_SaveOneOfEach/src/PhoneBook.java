import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneBook {

	private static PhoneBook pb;
	private HashSet<PhoneInfo> set;
	private Iterator<PhoneInfo> itr;

	private PhoneBook() 
	{
		loadData();
	}

	public void loadData()
	{
		set = new HashSet<PhoneInfo>();
		try(ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream("phoneInfo.data")) ) {
			if(objInStream != null)
			{
				PhoneInfo phoneInfo = (PhoneInfo)objInStream.readObject();
				while(phoneInfo != null)
				{
					insertPhoneInfo(phoneInfo);
					try {
						phoneInfo = (PhoneInfo)objInStream.readObject();
					}
					catch(EOFException e)
					{
						break;
					}

				}
			}			
		} catch (FileNotFoundException e) {
			System.out.println("등록된 데이터가 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static PhoneBook getPhoneBook()
	{
		if(pb==null)
			pb = new PhoneBook();
		return pb;
	}

	public boolean insertPhoneInfo(PhoneInfo phoneInfo)
	{		
		return set.add(phoneInfo);
	}

	public boolean searchPhoneInfoByName(String name)
	{
		PhoneInfo pInfo = null;
		itr = set.iterator();
		boolean result = false;

		while(itr.hasNext())
		{			
			pInfo = itr.next();
			if(pInfo.getName().equals(name))
			{
				pInfo.printCurrentState();
				result = true;
			}
		}

		return result;
	}

	public boolean deletePhoneInfoByPhoneNumber(String phoneNumber)
	{
		PhoneInfo pInfo = null;
		itr = set.iterator();

		while(itr.hasNext())
		{			
			pInfo = itr.next();
			if(pInfo.getPhoneNumber().equals(phoneNumber))
			{
				itr.remove();
				return true;
			}
		}
		return false;
	}

	public void printAllPhoneInfo()
	{
		itr = set.iterator();
		while(itr.hasNext())
		{
			itr.next().printCurrentState();
		}
	}

	public void saveData() {
		if(set.size() == 0) return;

		try(ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("phoneInfo.data"))) {
			itr = set.iterator();
			while(itr.hasNext())
				objOutStream.writeObject(itr.next());	
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void quitProgram() {
		saveData();
	}
}