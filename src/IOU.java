import java.util.HashMap;
import java.util.Map;

public class IOU {

    private HashMap<String,Double> iouMap = new HashMap<>();

    public IOU() {

    }

    public static void main(String[] args) {

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

    }

   

 public void setSum(String toWhom, double amount) {

        iouMap.put(toWhom,amount);


    }

    public double howMuchDoIOweTo(String toWhom) {
        for (Map.Entry<String, Double> iouMap : iouMap.entrySet()) {
            if (iouMap.getKey().equalsIgnoreCase(toWhom)) {
                return iouMap.getValue();

            }
        }

        return 0;
    }

}