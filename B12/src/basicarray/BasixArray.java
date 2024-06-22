package basicarray;

public class BasixArray {

    public static void main(String[] args) {
//        playWithPrimitiveArray();
//        playWIthPrimitiveArrayV3();
        playWithAStudent();
    }
    
    
    public static void sortStudentArray() {
        Student[] x = new Student[2];
        
        x[0] = new Student("HE176173", "Dao Viet", 2003, 9.0);
        x[1] = new Student("HE123455", "Hoang Minh", 1997, 2.0);
    }
    
    public static void playWithObjactArray() {
        // tui can luu 50 gia tri int
        int[] a = new int[50];
//        a[0] = 0;
//        a[1] = 1;
        // tui can luu ho so 50 sinh vien
        Student[] s = new Student[50];  
        s[0] = new Student("Viet", "Nam", 2003, 2.4);
        s[1] = new Student("An", "Nam", 2004, 6.4);
        s[2] = new Student("Nguyen", "Binh", 2001, 7.4);
        
        
    }
    
    public static void playWithAStudent() {
        // mún có một sv, ta cần 2 thứ: con trỏ/biến tham chiếu = value phức tạp new ()
       Student x;
       x = new Student("HE176173", "Viet Dao", 2003, 9.0);
       x.showProfile();
       x = null; // x hạ cánh, trỏ đáy ram, lưu tọa độ 0, cùng này 8 transitor
        x.showProfile();
    }
    
    public static void playWIthPrimitiveArrayV3() {
        // int arr1[50]; khong cho lam vay;
//        int arr2[] = {1, 3, 45, 64, 4};
//        int arr3[] = new int[] {5, 12, 43, 65, 23}; giong cai ben tren
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        
        
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr);
        
    }
    
    public static void playWithPrimitiveArrayV2() {
//        float* arr = calloc(7, sizeof(float));
        double arr[] = new double[365];
        arr[0] = 68;
        arr[1] = 79;
        arr[2] = 100;
        
        System.out.println("array");
        for(int i = 0; i < 365; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void playWithPrimitiveArray() {
        double v[] = {0, 5, 6, 2, 45, 67, 6};

        v[6] = 234;

        System.out.println(v[0] + " " + v[2]);
        System.out.printf("%f\n", v[0]);

        for (int i = 0; i < 6; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\n\n The array v has values of (using for each)");
        for (double x : v) {
            System.out.println(x + " ");
        }
    }

}
