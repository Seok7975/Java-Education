import java.io.*;

class PhoneBookManager {
    private static PhoneBookManager instance = new PhoneBookManager();
    private PhoneBook pb;

    // 생성자
    private PhoneBookManager() {
        // PhoneBook 인스턴스를 생성합니다.
        pb = new PhoneBook();
        // 파일에서 데이터를 읽어옵니다.
        restoreData();
    }

    // 인스턴스 반환 메서드
    public static PhoneBookManager getInstance() {
        return instance;
    }

    // 전화번호부 실행 메서드
    public void run() {
        // 실행 코드 작성
    }

    // 파일에서 데이터를 읽어오는 메서드
    private void restoreData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("PhoneData.dat"))) {
            // 파일로부터 데이터를 읽어와서 PhoneBook에 추가합니다.
            pb = (PhoneBook) in.readObject();
            System.out.println("데이터를 복원하였습니다.");
        } catch (FileNotFoundException e) {
            // 파일이 없는 경우에는 그냥 넘어갑니다.
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 데이터를 파일에 저장하는 메서드
    private void saveData() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PhoneData.dat"))) {
            // PhoneBook을 파일에 쓰기 위해 객체를 직렬화하여 저장합니다.
            out.writeObject(pb);
            System.out.println("데이터를 저장하였습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 추가적인 메서드들을 구현합니다.
}