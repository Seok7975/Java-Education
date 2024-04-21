//5. HashMap에 각가 key와 Value를
//"myId", "1234"
//"asdf", "1111"
//"asdf", "1234"
//를 저장하고 id와 password를 입력받자.
//그리고 id가 없으면 없다고 출력하고,
//id가 있고 비밀번호가 일치하면 일치한다고 출력하고,
//일치하지 않으면 일치하지 않는다고 출력하자.

import java.util.HashMap;
import java.util.Scanner;

class HashMap_Id_Password
{
    public static void main(String[] args)
    {
        HashMap<String, String> hash = new HashMap<>();

        hash.put("myId", "1234");
        hash.put("asdf", "1111");
        hash.put("asdf", "1234");

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("id와 password를 입력해주세요");
            System.out.print("ID : ");
            String id = sc.nextLine().trim();

            System.out.print("password : ");
            String password = sc.nextLine().trim();
            System.out.println();

            if(!hash.containsKey(id))
            {
                System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            else
            {
                if(!(hash.get(id)).equals(password))
                {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
                else
                {
                    System.out.println("ID와 비밀번호가 일치합니다.");
                    break;
                }
            }
            sc.close();
        }

    }
}