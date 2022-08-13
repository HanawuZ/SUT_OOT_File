package Loop.ForLoop;

public class For_Each_Loop2 {
    public static void main(String[] args) {
        /*  o ข้อดีของ For Each Loop
              [1] ทำให้โค๊ดอ่านง่ายมากขึ้น สะดวกต่อการทำความเข้าใจการทำงาน
        
            o ข้อเสียของ For Each Loop
              [1] For Each Loop ไม่สามารถแก้ไขสมาชิกในอาเรย์ได้
              [2] ไม่สามารถเข้าถึงสมาชิกในอาเรย์แบบย้อนกลับได้ 
              [3] ไม่สามารถเข้าถึงสมาชิกในอาเรย์แบบข้ามตำแหน่งได้
        */
        int arr[] = {1,4,5,7};
        for (int num : arr){
            num+=2;
            System.out.format("%d ",num);
        }
        System.out.println();
        for (int num : arr){
            System.out.format("%d ",num);
        }
    }
}
