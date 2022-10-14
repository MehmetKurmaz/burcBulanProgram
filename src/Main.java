import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day,month;
        String burc="";
        boolean hata=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Dogdugunuz  Gunu Giriniz :");
        day=input.nextInt();
        System.out.print("Dogdugunuz  Ayi Giriniz :");
        month=input.nextInt();
        if (month==1){
            if (day>=1&&day<31){
                if (day>=22){
                    burc="Kova";
                }else burc="Oglak";
            }else hata=true;
        }
        if (month==2){
            if (day>=1&&day<=28){
                if (day>=20){
                    burc="Balık";
                }else burc="Kova";
            }else hata=true;
        }
        if (month==3){
            if (day>=1&&day<=31){
                if (day>=21){
                    burc="Koc";
                }else burc="Balik";
            }else hata=true;
        }
        if (month==4){
            if (day>=1&&day<=30){
                if (day>=21){
                    burc="Boga";
                }else burc="Koc";
            }else hata=true;
        }
        if (month==5){
            if (day>=1&&day<=31){
                if (day>=22){
                    burc="ikizler";
                }else burc="Boga";
            }else hata=true;
        }
        if (month==6){
            if (day>=1&&day<=30){
                if (day>=23){
                    burc="Yengec";
                }else burc="ikizler";
            }else hata=true;
        }
        if (month==7){
            if (day>=1&&day<=31){
                if (day>=23){
                    burc="Aslan";
                }else burc="Yengec";
            }else hata=true;
        }
        if (month==8){
            if (day>=1&&day<=28){
                if (day>=23){
                    burc="Basak";
                }else burc="Aslan";
            }else hata=true;
        }
        if (month==9){
            if (day>=1&&day<=30){
                if (day>=23){
                    burc="Terazi";
                }else burc="Basak";
            }else hata=true;
        }
        if (month==10){
            if (day>=1&&day<=31){
                if (day>=23){
                    burc="Akrep";
                }else burc="Terazi";
            }else hata=true;
        }
        if (month==11){
            if (day>=1&&day<=30){
                if (day>=22){
                    burc="Yay";
                }else burc="Akrep";
            }else hata=true;
        }
        if (month==12){
            if (day>=1&&day<=31){
                if (day>=22){
                    burc="Oglak";
                }else burc="Yay";
            }else hata=true;
        }
        if (hata){
            System.out.println("Hatali Giris Yaptiniz");
            return;
        }else System.out.println("Burcunuz :"+burc);

    }
}