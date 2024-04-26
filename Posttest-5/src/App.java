import java.util.ArrayList;

import Data.ServiceCenter;
import Data.Robot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Robot> RobotList = new ArrayList<Robot>();
        ArrayList<ServiceCenter> ServiceCenterList = new ArrayList<ServiceCenter>();

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        RobotList.add(new Robot("Ambakowi", "Jalan Istana", "NEKOmeme","02", "12-02-2024"));
        RobotList.add(new Robot("Ambagiri", "Jalan squad", "MKjaya","06", "12-02-2024"));
        ServiceCenterList.add(new ServiceCenter("Ambamimin", "Jalan Keruntuhan", "Bangbang", "Jalan Blunder"));

        String menu1, menu2;
        int ubah,hapus;

        while (true) {
            System.out.print("""
                    =========== Menu =============
                    1. Manajemen Robot
                    2. Manajemen Service Center
                    3. Tampilkan Robot
                    4. Tampilkan Robot (Nama dan Seri)
                    5. Tampilkan Robot (Nama dan Nama Produser)
                    6. Tampilkan Produser
                    7. Tampilkan Service Center
                    0. Keluar
                    ==============================
                    """);
                    System.out.print("Masukkan Pilihan : ");
                    menu1 = br.readLine();
                    if (menu1.equals("1")) {
                        System.out.print("""
                            ==============================
                            Menu Manajemen Robot:
                            1. Tambah Robot
                            2. Ubah Robot
                            3. Hapus Robot
                            0. Kembali
                            ==============================
                            """);
                        System.out.print("Masukkan Pilihan : ");
                        menu2 = br.readLine();
                        if (menu2.equals("1")) {
                            System.out.println("==============================");
                            System.out.print("Masukkan Nama Produser     : ");
                            String NamaProduser = br.readLine();
                            System.out.print("Masukkan Alamat Produser   : ");
                            String AlamatProduser = br.readLine();
                            System.out.print("Masukkan Nama Produk       : ");
                            String NamaProduk = br.readLine();
                            System.out.print("Masukkan Seri Produk       : ");
                            String SeriProduk = br.readLine();
                            System.out.print("Masukkan Tanggal Pembuatan : ");
                            String TanggalPembuatan = br.readLine();
                            System.out.println("==============================");
                            RobotList.add(new Robot(NamaProduser, AlamatProduser, NamaProduk, SeriProduk, TanggalPembuatan));

                        } else if (menu2.equals("2")) {
                            System.out.println("==============================");
                            for (int i = 0; i < RobotList.size(); i++) {
                                System.out.println("Data ke : " + i);
                                RobotList.get(i).Lihat();
                                System.out.println("==============================");
                            }
                            System.out.print("Pilih data yang akan diubah : ");
                            ubah = Integer.parseInt(br.readLine());

                            if (ubah <= RobotList.size()) {
                                System.out.println("==============================");
                                System.out.print("Masukkan Nama Produser     : ");
                                String NamaProduser = br.readLine();
                                System.out.print("Masukkan Alamat Produser   : ");
                                String AlamatProduser = br.readLine();
                                System.out.print("Masukkan Nama Produk       : ");
                                String NamaProduk = br.readLine();
                                System.out.print("Masukkan Seri Produk       : ");
                                String SeriProduk = br.readLine();
                                System.out.print("Masukkan Tanggal Pembuatan : ");
                                String TanggalPembuatan = br.readLine();
                                RobotList.get(ubah).setNamaProduser(NamaProduser);
                                RobotList.get(ubah).setAlamatProduser(AlamatProduser);
                                RobotList.get(ubah).setNamaProduk(NamaProduk);
                                RobotList.get(ubah).setSeriProduk(SeriProduk);
                                RobotList.get(ubah).setTanggalPembuatan(TanggalPembuatan);
                                System.out.println("Data berhasil dirubah");
                                System.out.println("==============================");
                            } else {
                                System.out.println("Data tidak ada");
                            }

                        } else if (menu2.equals("3")) {
                            System.out.println("==============================");
                            for (int i = 0; i < RobotList.size(); i++) {
                                System.out.println("Data ke : " + i);
                                RobotList.get(i).Lihat();
                                System.out.println("==============================");
                            }
                            System.out.print("Pilih data yang akan dihapus : ");
                            hapus = Integer.parseInt(br.readLine());
                            if (hapus <= RobotList.size()) {
                                System.out.println("Data berhasil dihapus");
                                RobotList.remove(hapus);
                            } else {
                                System.out.println("Data tidak ada");
                            }

                        } else if (menu2.equals("0")) {
                            continue;
                        } else {
                            System.out.println("Menu tidak ada");
                        }

                    } else if (menu1.equals("2")) {
                        System.out.print("""
                            ==============================
                            Menu Manajemen Service Center:
                            1. Tambah Service Center
                            2. Ubah Service Center
                            3. Hapus Service Center
                            0. Kembali
                            ==============================
                            """);
                        System.out.print("Masukkan Pilihan : ");
                        menu2 = br.readLine();
                        if (menu2.equals("1")) {
                            System.out.println("==============================");
                            System.out.print("Masukkan Nama Produser         : ");
                            String NamaProduser = br.readLine();
                            System.out.print("Masukkan Alamat Produser     : ");
                            String AlamatProduser = br.readLine();
                            System.out.print("Masukkan Nama Service Center   : ");
                            String NamaServiceCenter = br.readLine();
                            System.out.print("Masukkan Alamat Service Center : ");
                            String AlamatServiceCenter = br.readLine();
                            System.out.println("==============================");
                            ServiceCenterList.add(new ServiceCenter(NamaProduser, AlamatProduser, NamaServiceCenter, AlamatServiceCenter));

                        } else if (menu2.equals("2")) {
                            System.out.println("==============================");
                            for (int i = 0; i < ServiceCenterList.size(); i++) {
                                System.out.println("Data ke : " + i);
                                ServiceCenterList.get(i).Lihat();
                                System.out.println("==============================");
                            }
                            System.out.print("Pilih data yang akan diubah : ");
                            ubah = Integer.parseInt(br.readLine());
                            if (ubah <= ServiceCenterList.size()) {
                                System.out.println("==============================");
                                System.out.print("Masukkan Nama Produser         : ");
                                String NamaProduser = br.readLine();
                                System.out.print("Masukkan Alamat Produser     : ");
                                String AlamatProduser = br.readLine();
                                System.out.print("Masukkan Nama Service Center   : ");
                                String NamaServiceCenter = br.readLine();
                                System.out.print("Masukkan Alamat Service Center : ");
                                String AlamatServiceCenter = br.readLine();
                                ServiceCenterList.get(ubah).setNamaServiceCenter(NamaServiceCenter);
                                ServiceCenterList.get(ubah).setAlamatServiceCenter(AlamatServiceCenter);
                                ServiceCenterList.get(ubah).setNamaProduser(NamaProduser);
                                ServiceCenterList.get(ubah).setAlamatProduser(AlamatProduser);
                                System.out.println("Data berhasil diubah");
                                System.out.println("==============================");
                            } else {
                                System.out.println("Data tidak ada");
                            }

                        } else if (menu2.equals("3")) {
                            System.out.println("==============================");
                            for (int i = 0; i < ServiceCenterList.size(); i++) {
                                System.out.println("Data ke : " + i);
                                ServiceCenterList.get(i).Lihat();
                                System.out.println("==============================");
                            }
                            System.out.print("Pilih data yang akan dihapus : ");
                            hapus = Integer.parseInt(br.readLine());
                            if (hapus <= ServiceCenterList.size()) {
                                System.out.println("Data berhasil dihapus");
                                ServiceCenterList.remove(hapus);
                            } else {
                                System.out.println("Data tidak ada");
                            }

                        } else if (menu2.equals("0")) {
                            continue;

                        } else {
                            System.out.println("Menu tidak ada");
                        }

                    } else if (menu1.equals("3")) {
                        System.out.println("==== Data Robot =====");
                        if (RobotList.size() != 0) {
                            for (int i = 0; i < RobotList.size(); i++) {
                                RobotList.get(i).Lihat();
                                System.out.println("==============================");
                            }                  
                        } else {
                            System.out.println("Tidak ada data");
                        }
                        
                    } else if (menu1.equals("4")) {
                        System.out.println("===== Menampilkan Nama dan Seri =====");
                        if (RobotList.size() != 0) {
                            for (int i = 0; i < RobotList.size(); i++) {
                                RobotList.get(i).Lihat("Nama dan Seri");
                                System.out.println("==============================");
                            }             
                        } else {
                            System.out.println("Tidak ada data");
                        }
                        

                    } else if (menu1.equals("5")) {
                        System.out.println("==== Robot dan Produser ====");
                        if (RobotList.size() != 0) {
                            for (int i = 0; i < RobotList.size(); i++) {
                                RobotList.get(i).Lihat(1);
                                System.out.println("==============================");
                            }             
                        } else {
                            System.out.println("Tidak ada data");
                        }

                    } else if (menu1.equals("6")) {
                        System.out.println("==== Data Produser ====");
                        if (RobotList.size() != 0) {
                            for (int i = 0; i < RobotList.size(); i++) {
                                RobotList.get(i).LihatProduser();
                                System.out.println("==============================");
                            }
                        } else {
                            System.out.println("Tidak ada data");
                        }

                    } else if (menu1.equals("7")) {
                        System.out.println("==== Data Service Center ====");
                        if (ServiceCenterList.size() != 0) {
                            for (int i = 0; i < ServiceCenterList.size(); i++) {
                                ServiceCenterList.get(i).Lihat();
                                System.out.println("==============================");
                            }             
                        } else {
                            System.out.println("Tidak ada data");
                        }

                    } else if (menu1.equals("0")) {
                        System.out.println("Program telah berhenti");
                        break;
                    } else {
                        System.out.println("Menu tidak ada");
                    }
        }
    }
}
