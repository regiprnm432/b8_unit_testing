# Proyek Kelompok B8

Selamat datang di repositori Kelompok B8!

## Deskripsi

Proyek ini bertujuan untuk melakukan automation testing dengan tools Junit5 dan Gradle pada program Kalkulator.

## Anggota Kelompok

- Helsa Alika Femiani - 211524044
- Novia Nur Azizah - 211524053
- Regi Purnama - 211524057

## Cara Menjalankan Program

Untuk menjalankan program kami, ikuti langkah-langkah di bawah ini:

1. Pastikan Anda telah menginstal Java 21 dan Gradle 8.7
2. Clone repositori ini ke komputer lokal Anda menggunakan perintah `git clone https://github.com/noviazizah/AutomationTesting.git`.
3. Buka terminal atau command prompt, lalu pindah ke direktori proyek (`cd AutomationTesting`).
4. Jalankan perintah `./gradlew build` untuk build program setelah clone.
5. Setelah berhasil dibuild, jalankan perintah `./gradlew test` untuk mengenerate test script.


## Struktur Folder Project
```
/app
│   /bin
│
├── /build
│   ├── /classes
│   │   ├── /generated
│   │   ├── /reports
│   │   ├── /tests
│   │   │   ├── /test
│   │   │   │   ├── /classes
│   │   │   │   ├── /css
│   │   │   │   ├── /js
│   │   │   │   ├── /package
│   │   │   │   ├── index.html
│   │   │   ├── /test-results
│   │   │   └── /tmp
│   │
│   └── /src
│       ├── /main
│       │   ├── /java
│       │   │   └── /org
│       │   │       └── /example
│       │   │           ├── Computation.java
│       │   │           ├── MainApp.java
│       │   │           ├── Operator.java
│       │   │           └── Validator.java
│       │
│       └── /test
│           ├── /java
│           │   └── /org
│           │       └── /example
│           │           ├── ComputationTest.java
│           │           ├── MainAppTest.java
│           │           ├── OperatorTest.java
│           │           └── ValidatorTest.java
│           │
│           └── build.gradle
│
└── /gradle
```
- Source code program kalkulator dapat diakses di app/src/main/java/org/example
- Test script dapat diakses diakses di app/src/test/java/org/example
- Test Report Generated dapat diakses di app/build/tests/test

## Item Pengujian
| No. | Class       | Method               | Total Test Case |
|-----|-------------|----------------------|-----------------|
| 1   | MainApp     | Main                 | 10              |
| 2   | Operator    | tambah<br>kurang<br>kali<br>bagi | 17              |
| 3   | Computation | compute              | 5               |
| 4   | Validator   | isNumeric<br>isInRange<br>isValidOperator<br>isValidDivision<br>validateInput<br>validateOperator | 13              |

## Generate Report

![Test Summary Secara Keseluruhan](https://drive.google.com/file/d/1uhZVSYQ7vPwf-JFKXR5R3dkmImAjNFCk/view)

![Test Summary MainAppTest](https://drive.google.com/file/d/1RqnY7xbvN1ZnjkMmYRf8a2nJhhChPM6B/view?usp=drive_link)

![Test Summary OperatorTest](https://drive.google.com/file/d/1IvlEQTcZuh67dLucpXDlf8qQF_ZLBECU/view?usp=drive_link)

![Test Summary ComputationTest](https://drive.google.com/file/d/1Cl_BYHRFoQ_4KWFemgfqMXDrFzIa_A8P/view?usp=drive_link)

![Test Summary ValidatorTest](https://drive.google.com/file/d/1fweIJwW-V1iF0yxW1D1tcSMAhSS7233M/view?usp=drive_link)

## Cara Berkontribusi

Kami menyambut kontribusi dari siapa saja! Jika Anda ingin berkontribusi, silakan ikuti langkah-langkah berikut:

1. Fork repositori ini.
2. Buat branch baru untuk fitur Anda (`git checkout -b fitur-baru`).
3. Lakukan perubahan yang diperlukan.
4. Commit perubahan Anda (`git commit -am 'Menambahkan fitur baru'`).
5. Push ke branch Anda (`git push origin fitur-baru`).
6. Buat permintaan tarik (pull request) baru.

