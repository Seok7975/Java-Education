import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneBook
{

    private static PhoneBook pb;
    private HashSet<PhoneInfo> set;
    private Iterator<PhoneInfo> itr;

    private PhoneBook()
    {
        loadData();
    }

    public void loadData()
    {
        try (ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream("phoneInfo.data")))
        {
            if (objInStream != null)
            {
                set = (HashSet<PhoneInfo>) objInStream.readObject();
            }
        }
        catch(FileNotFoundException e)
        {
            set = new HashSet<PhoneInfo>();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public static PhoneBook getPhoneBook()
    {
        if (pb == null)
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
        Iterator<PhoneInfo> itr = set.iterator();
        boolean result = false;

        while (itr.hasNext())
        {
            pInfo = itr.next();
            if (pInfo.getName().equals(name))
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

        while (itr.hasNext())
        {
            pInfo = itr.next();
            if (pInfo.getPhoneNumber().equals(phoneNumber))
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
        while (itr.hasNext())
        {
            itr.next().printCurrentState();
        }
//		for(PhoneInfo info: set)
//			info.printCurrentState();
    }

    public void saveData()
    {
        if (set.size() == 0)
            return;
        try (ObjectOutputStream objOutStream =
                     new ObjectOutputStream(new FileOutputStream("phoneInfo.data")))
        {
            objOutStream.writeObject(set);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void quitProgram()
    {
        saveData();
    }

    ;
}