# DAON MES – Manufacturing Execution System (Backend)

Spring Boot 기반으로 개발한 **MES 백엔드 API 서버**입니다.  
생산 및 품질 흐름과 관련된 데이터를 처리하기 위한 구조로 구성했으며,  
MES 프론트엔드 애플리케이션과의 연동을 고려해 프로젝트를 설계했습니다.

단순 CRUD 중심 구성을 넘어,  
**생산 및 품질 프로세스를 고려한 MES 백엔드 구조**를 목표로 개발했습니다.

---

## 📌 Project Overview

DAON MES Backend는 생산 및 품질 흐름을 처리하기 위한  
MES 백엔드 API 서버입니다.

Spring Boot 기반으로 구성되었으며,  
데이터베이스 연동, API 처리, 유효성 검증, 향후 인증 및 보안 확장을 고려한 구조로 설계했습니다.

### 핵심 목표
- MES 업무 흐름을 위한 백엔드 API 기반 마련
- 생산 / 품질 데이터 처리를 위한 서버 구조 구성
- 데이터베이스 연동 및 JPA 기반 처리
- 프론트엔드와 연동 가능한 API 서버 구성

---

## 🚀 Tech Stack

### Backend
- **Java 21**
- **Spring Boot**
- Spring Web MVC
- Spring Data JPA
- Spring Security
- Spring Validation
- Lombok

### Database
- MariaDB

### Authentication / Security
- JJWT 라이브러리 포함
- Spring Security 기반 확장 구조 고려

### Dev Tools
- Gradle
- Git
- GitHub
- IntelliJ IDEA / VS Code

---

## ✨ Main Features

### 🏭 생산 및 품질 API 기반 구성
- 생산 및 품질 흐름을 위한 백엔드 구조 구성
- 프론트엔드 연동을 고려한 API 처리 기반 마련
- 도메인 확장을 고려한 프로젝트 구조 설계

### 🗄 데이터 처리 및 검증
- MariaDB 연동 설정
- Spring Data JPA 기반 데이터 처리
- Validation 기반 요청값 검증 구조 포함

### ⚙️ 서버 설정
- 애플리케이션 포트 설정
- SQL 로그 출력 설정
- 상세 에러 메시지 및 바인딩 오류 출력 설정

---

## 🔄 Backend Workflow

1. 클라이언트가 생산 또는 품질 관련 요청을 보낸다
2. 서버가 요청값을 검증하고 비즈니스 로직을 처리한다
3. JPA를 통해 데이터베이스와 연동한다
4. 처리 결과를 API 응답으로 반환한다
5. 향후 인증 및 권한 처리 구조를 연동할 수 있도록 확장한다

---

## 🛠 Getting Started

### 1. Clone repository
```bash
git clone https://github.com/Nara-Park-513/mes-backend.git
cd mes-backend
```

### 2. Configure environment
`src/main/resources/application.properties` 파일에서 데이터베이스 및 서버 설정을 확인합니다.

예시:

```properties
spring.application.name=mes
server.port=9500

spring.datasource.url=jdbc:mariadb://localhost:3307/mes
spring.datasource.username=root
spring.datasource.password=1234
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 3. Build project
```bash
./gradlew clean build
```

### 4. Run server
```bash
./gradlew bootRun
```

### 5. Open in browser
```bash
http://localhost:9500
```

> MES 프론트엔드 애플리케이션과 함께 실행하면 API 연동을 확인할 수 있습니다.

---

## ⚠️ Troubleshooting

개발 과정에서 아래와 같은 항목을 중심으로 점검할 수 있습니다.

- MariaDB 연결 설정 확인
- 서버 포트 및 application.properties 설정 확인
- JPA 매핑 및 SQL 로그 출력 확인
- 요청값 검증 및 예외 응답 구조 점검
- 프론트엔드 연동 시 API 경로 및 CORS 설정 점검

---

## 🎯 Project Purpose

- 생산 및 품질 흐름을 고려한 MES 백엔드 구조 설계
- 데이터 처리 및 API 응답 기반 서버 구현
- 프론트엔드 연동을 고려한 확장 가능한 백엔드 프로젝트 구성
- 실제 제조 실행 시스템 구조를 반영한 서버 개발 경험 축적

---

## 🔮 Future Improvements

- 생산 / 품질 도메인 API 확장
- 인증 및 권한 처리 구조 고도화
- 예외 처리 및 응답 포맷 표준화
- 테스트 코드 및 검증 로직 강화
- 프론트엔드 연동 기능 고도화

---

## 👩‍💻 Author

DAON MES Backend Project