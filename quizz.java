// 1.) yang dibutuhkan yaitu class induk yaitu class kendaraan dan class main. class kendaraan yang inheritancenya yaitu class motor dan class mobil
// yang mana class kendaraan  untuk super class atau inti dari class motor dan mobil
// dan class kendaraan untuk inheritance class motor dan mobil
// jadi yang diubutuhkan yaitu
// -class main (untuk menampilkan atau memanggil hasil dari class kendaraan )
// -class kendaraan(sebagai superclass atau induk dari classmotor dan class mobil)
// -class motor(extends daari kendaraan atau subclass dari kendaraan)
// -class mobil(extends dari kendaraan atau subclass dari kendaraan)
// 2.) atribut untuk class induk atau super class yaitu nomorPolisi,tahunProduksi,dan statusService
// dan untuk atribut yang digunakan class mobil ada tambahan yaitu jumlahPintu dan tipeTransmisi
// dan untuk atribut yangdigunakan class motor ada tambahan yaitu jenisMesin dan KapasitasTangki
// untuk method yang digunakan dalam super class atau class kendaraan yaitu nomor polisi,merek,statusServi,tampilkan data , dan ubah statusservice
// untuk method yang digunakan dalam subclass motor adalah tampilkan data,ubahstatusservice,jenis mesin,dan kapasitastangki
// untuk method yang digunakan dalam subclass mobil adalah tampilkan data,ubahstatusservice,jumlahpintu,dan tipetransmisi
//3.) public kendaraan (int nomorpolisi, String merek, int tahunproduksi){
       // this.nomorpolisi  = nomorpolisi;
        // this.merek  = merek;
        // this.tahunproduksi= tahunproduksi;
          // }
// fungsi constructor adalah untuk memberikan nilaii  awal pada atribut dan dipanggil di main untuk diisii argumen
// 4.) jika ingin atribut di statuservice ingin dilindungi atau dibatasi kita bisa tambahkan private agar hanya kita yang dapat diakses
// dan jika kita ingin menggunakan data data atau atribut dari statusservice maka kita bisa menggunakan getter
// contohnya ublic class kendaraan {
    // private String statussrevice;
    // ublic double statusservice(){ 
        // return statusservice;
    // }
// 5.)karena dengan menggunakan henritance kita bisa menurunkan data data dari super class tanapa membuat baru lagi ,dan mengaapa kendaraan lebih cocok
// menjadi super class karena agar data dari kendaraan bisadi turunkan ke motor atau mobil yang lebih khusus atau karena kendraan itu sendiri adalah sesuatu
// yang umum dan motor mobil adalah sesuatu yang khusus ,dengan menggunakan kendaraan menjadi super class kita bisa menurunkan datany ke motor dan mobil tanpa
// mebuat code baru lagii yang bakal bikin kita cape
// 6.)public mobil(int jumlahpintu , String tipetransmisi){
        // super(jumlahpintu, tipetransmisi);
        // this.tipetransmisi = tipetransmisi;
    // }
    // public motor(String jenismesin , int kapasitastangki){
        // super(jenismesin,kapasitastangki);
        // this.kapasitastangki = kapasitastangki;
    // }
    // nilaidari atribut mobil yaitu itu untuk jumlah pintu ddan stringuntuk tipetransmisi
    // dan nilai dari atribut motor itu untuk streing untuk jenismesin dan int untuk kaoasitastangki
