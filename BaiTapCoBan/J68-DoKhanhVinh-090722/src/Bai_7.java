public class Bai_7 {
    public static void main(String[] args){
        CanBo canBo1 = new CanBo();
        System.out.println("Nhap thong tin can bo thu 1: ");
        canBo1.nhap();

        CanBo canBo2 = new CanBo();
        System.out.println("Nhap thong tin can bo thu 2: ");
        canBo2.nhap();

        CanBo canBo3 = new CanBo();
        System.out.println("Nhap thong tin can bo thu 3: ");
        canBo3.nhap();

        System.out.println("\t\t\tDANH SACH CAN BO");
        System.out.printf("%-3s %-10s %-30s %-10s %-17s %-17s %-20s%n",
                "STT", "Ma can bo", "Ho va ten", "Ngay sinh", "So ngay lam viec", "So gio lam them", "Luong");

        int stt = 1;
        System.out.printf("%3d", stt++);
        canBo1.hienThi();
        System.out.printf("%3d", stt++);
        canBo2.hienThi();
        System.out.printf("%3d", stt++);
        canBo3.hienThi();
    }
}
