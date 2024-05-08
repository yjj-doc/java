# JAAS
Java Authentication and Authorization Service  
: 자바 인증 및 권한 부여 서비스  
: 코드를 실행할 사용자가 누구인가를 검증하기 위한 인터페이스 모음  
: 플러그인 방식으로 인증 수행 (인증으로 부터 애플리케이션이 독립된 상태)  
: 이름, 비밀번호, 인증서, 생체 정보 등 다양한 인증 방식 지원  
: Kerberos, LDAP 같은 인증 프로토콜과 함께 사용 가능  

인증  
: 사용자 신원 확인  

인가(=권한)  
: 인증 후 사용자의 역할에 따라 권한 부여  

PAM(Pluggable Authentication Modules)  
: 리눅스에서 사용하는 사용자 인증 관리 모듈    
: 사용자 인증을 수행하는 모듈화된 방식 제공  


**자바 보안 프레임워크**  
- JAAS
- Apache Shiro
- Spring Security


**API**
- java.security.Principal
- javax.security.auth.Subject
- javax.security.auth.login.LoginContext
- javax.security.auth.spi.LoginModule
- javax.security.auth.Destroyable
- javax.security.auth.Refreshable

```
Principal
: Subject 속성 캡슐화  

Subject
: 인증을 요청하는 사용자

LoginModule
: 인증 구현을 위한 인터페이스

LoginContext  
: 인증 프로세스
```