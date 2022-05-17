import java.util.HashMap;

public class NickNames {
    public static void main(String[] args) {
       HashMap<String, String> nickNameMap =new HashMap<>();      

       nickNameMap.put("matthew", "matt");
       nickNameMap.put("michael", "mix");
       nickNameMap.put("arthur", "artie");


       System.out.println(nickNameMap.get("matthew"));

    }
}
