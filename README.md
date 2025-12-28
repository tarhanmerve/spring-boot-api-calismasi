# CV Management System - Backend API

Bu proje, kullanıcıların eğitim, deneyim ve kişisel bilgilerini yönetebildiği **Spring Boot** tabanlı bir RESTful API çalışmasıdır.

## 💻 Proje Hakkında Önemli Not
Bilgisayarımda meydana gelen teknik bir arıza nedeniyle projenin tüm dosyaları maalesef kaybolmuştur. Bu depo (repository), mail üzerinden kurtarabildiğim temel kaynak kodlarını (Controller, Service, Repository ve Entity katmanları) içermektedir. Projenin mimari yapısını göstermek amacıyla paylaşılmıştır.

## 🛠 Kullanılan Teknolojiler
* **Java 17**
* **Spring Boot 3.x**
* **Spring Data JPA** (Veri erişim katmanı)
* **H2 Database** (Bellek içi veritabanı)
* **Maven** (Proje yönetimi)

## 🏗 Mimari Yapı
Proje, sürdürülebilirlik ve okunabilirlik açısından **Katmanlı Mimari (Layered Architecture)** prensiplerine uygun olarak geliştirilmiştir:
* **Controller:** API uç noktalarının (endpoints) yönetimi.
* **Service:** İş mantığının (business logic) yürütülmesi.
* **Repository:** Veritabanı etkileşimleri.
* **Entity:** Veritabanı modelleri.
