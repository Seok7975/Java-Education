import java.io.*;

class PhoneBookManager {
    private static PhoneBookManager instance = new PhoneBookManager();
    private PhoneBook pb;

    // ������
    private PhoneBookManager() {
        // PhoneBook �ν��Ͻ��� �����մϴ�.
        pb = new PhoneBook();
        // ���Ͽ��� �����͸� �о�ɴϴ�.
        restoreData();
    }

    // �ν��Ͻ� ��ȯ �޼���
    public static PhoneBookManager getInstance() {
        return instance;
    }

    // ��ȭ��ȣ�� ���� �޼���
    public void run() {
        // ���� �ڵ� �ۼ�
    }

    // ���Ͽ��� �����͸� �о���� �޼���
    private void restoreData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("PhoneData.dat"))) {
            // ���Ϸκ��� �����͸� �о�ͼ� PhoneBook�� �߰��մϴ�.
            pb = (PhoneBook) in.readObject();
            System.out.println("�����͸� �����Ͽ����ϴ�.");
        } catch (FileNotFoundException e) {
            // ������ ���� ��쿡�� �׳� �Ѿ�ϴ�.
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // �����͸� ���Ͽ� �����ϴ� �޼���
    private void saveData() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PhoneData.dat"))) {
            // PhoneBook�� ���Ͽ� ���� ���� ��ü�� ����ȭ�Ͽ� �����մϴ�.
            out.writeObject(pb);
            System.out.println("�����͸� �����Ͽ����ϴ�.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // �߰����� �޼������ �����մϴ�.
}