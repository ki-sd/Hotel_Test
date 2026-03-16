🏨 Hotel Management Tool
----------------------


<br>
<br>

### <img src="https://flagcdn.com/w20/kr.png" width="20"> 한국어 <br>
자바 공부용 호텔 관리 시스템입니다. <br>
### <img src="https://flagcdn.com/w20/us.png" width="20"> English <br>
This Module is Hotel Management Program for Java Study. <br>
### <img src="https://flagcdn.com/w20/jp.png" width="20"> 日本語 <br> 
JAVA自習用のホテル管理システムです。<br>

---

🛠 개발 환경 (Environment / 開発環境)
---
* **Language** : <img src="https://img.shields.io/badge/Java_25-ED8B00?style=flat-square&logo=openjdk&logoColor=white" style="vertical-align: middle;">
* **Build System** : <img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white" style="vertical-align: middle;">
* **IDE** : <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat-square&logo=intellijidea&logoColor=white" style="vertical-align: middle;">
* **Library** : <img src="https://img.shields.io/badge/Jackson_JSON-24292e?style=flat-square&logo=json&logoColor=white" style="vertical-align: middle;">

<br>

---

<br>

✨ 주요 기능 (Key Features / 主な機能)
---

* <img src="https://flagcdn.com/w20/kr.png" width="20" style="vertical-align: middle;"> <b>회원 가입 및 로그인</b> : 사용자 계정 생성 및 인증 기능
* <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> <b>Sign-up & Login</b> : User account creation and authentication
* <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> <b>会員登録・ログイン</b> : ユーザーアカウントの作成および認証機能

<br>

* <img src="https://flagcdn.com/w20/kr.png" width="20" style="vertical-align: middle;"> <b>객실 예약</b> : 빈 객실을 확인하고 예약하는 기능
* <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> <b>Room Reservation</b> : Checking and booking available rooms
* <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> <b>客室予約</b> : 空室を確認し、予約を行う機能

<br>

* <img src="https://flagcdn.com/w20/kr.png" width="20" style="vertical-align: middle;"> <b>체크아웃</b> : 사용 중인 객실을 비우고 정산하는 기능
* <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> <b>Check-out</b> : Vacating and settling the room
* <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> <b>チェックアウト</b> : 利用中の客室を空け、精算を行う機能

<br>

* <img src="https://flagcdn.com/w20/kr.png" width="20" style="vertical-align: middle;"> <b>객실 현황 조회</b> : 전체 객실의 예약 상태를 한눈에 확인
* <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> <b>Room Status</b> : Overview of all room reservation statuses
* <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> <b>空室状況の確認</b> : 全客室の予約状態を一覧で確認する機能

<br>

---


✨ 추가된 주요 기능 (New Features / 追加機能)
---

* <img src="https://flagcdn.com/w20/kr.png" width="20" style="vertical-align: middle;"> <b>데이터 영속성 보장</b> : 프로그램 재시작 후에도 유저 및 예약 데이터가 유지되도록 JSON 기반 파일 DB 시스템 구현
* <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> <b>Data Persistence</b> : Implementation of JSON-based file storage system to maintain data after restart
* <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> <b>データの永속化</b> : プログラム再起動後もユーザーおよび予約データが維持されるよう、JSONベースのファイルDBシステムを実装

<br>

* <img src="https://flagcdn.com/w20/kr.png" width="20" style="vertical-align: middle;"> <b>관리자 매출 관리</b> : 전체 예약 데이터를 기반으로 총 매출을 실시간으로 계산하고 조회하는 기능
* <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> <b>Sales Management</b> : Admin feature for real-time total sales calculation based on all reservation data
* <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> <b>管理者売上管理</b> : 全予約データを基に、総売上をリアルタイムで計算・照会する機能

---
 🛠 트러블슈팅 (Troubleshooting)
---

### 1. JSON 저장 시 객체 간 순환 참조 이슈 (Circular Reference Issue)
**문제 (Issue)**:
`Reservation` 객체가 `User`와 `Room`을 포함하고 있어, JSON 직렬화 시 무한 루프가 발생할 위험 및 데이터 중복 발생.

**해결 (Solution)**:
- 데이터 저장 전용 객체인 **`ReservationData` (DTO)** 도입.
- 객체 전체를 저장하는 대신 각 객체의 고유 ID(UserId, RoomNumber)만 저장하는 방식으로 설계하여 데이터 무결성 확보 및 용량 최적화.

---

* <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> **Summary**: Resolved infinite loops and data redundancy during JSON serialization by introducing **`ReservationData` (DTO)** to store only unique IDs instead of full objects.
* <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> **要約**: `Reservation`オブジェクトが`User`と`Room`を参照することで発生するJSON直列化の無限ループ問題を、**`ReservationData` (DTO)**を導入し、固有IDのみを保存する設計に変更することで解決しました。

<br>

### 2. Windows 환경 Gradle 한글 깨짐 이슈 (Encoding Issue)
**문제 (Issue)**:
Gradle 기반 실행 시 콘솔창에서 한글이 깨져서 출력되는 현상 발생 (Windows 기본 인코딩인 MS949와 프로젝트 인코딩인 UTF-8의 충돌).

**해결 (Solution)**:
1. `build.gradle`에 JavaCompile 및 JavaExec 인코딩 옵션 강제 지정 (`-Dfile.encoding=UTF-8`).
2. 시스템 레지스트리 설정을 통해 Windows 콘솔의 기본 코드 페이지(Code Page)를 949에서 **65001(UTF-8)**로 변경하여 운영체제 수준에서 인코딩 일치시킴.

---

* <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> **Summary**: Fixed Korean character encoding errors in the Gradle console by configuring `build.gradle` and synchronizing the OS-level code page to **65001 (UTF-8)** via system registry modification.
* <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> **要約**: Windows標準のMS949とプロジェクトのUTF-8の衝突による文字化けを、`build.gradle`の設定およびレジストリ変更によるOSレベルでの**65001 (UTF-8)**同期を通じて解決しました。