#### 목표
사용자의 역할에 따라 제한을 두어 각자의 역할에 맞는 페이지 구현

#### 전체 흐름
![image](https://github.com/user-attachments/assets/50c32ec9-32ad-4d35-aef9-0a82a4b118b4)
1. 로그인 시 엑세스토큰은 로컬 스토리지에 리프레시 토큰은 쿠키에 저장한다.
2. 엑세스 토큰이 만료되면 401에러가 발생하고 리프레시 토큰은 새로운 엑세스토큰과 리프레시 토큰을 갱신한다.
3. 권한이 없는 페이지로 접근하면 access-denied 페이지로 이동한다.

#### 역할에 따른 콘텐츠 차이
ROLE_USER
메인화면
![image](https://github.com/user-attachments/assets/42102b29-d80c-4289-a157-b4306a3f2cfa)


ROLE_USER가 작성한 글에는 상세한 내용을 볼 수 있다.
![image](https://github.com/user-attachments/assets/81e37b9c-be6a-479e-9b26-777efd44f9b8)


본인이 작성하지 않은 글에는 접근제한이 걸린다.
![image](https://github.com/user-attachments/assets/bced2ed8-fd50-41de-8a30-4260a12f5c37)


ROLE_ADMIN
메인화면
![image](https://github.com/user-attachments/assets/54d4abf5-5ad1-4403-b4b2-6b682b541395)


ROLE_ADMIN도 ROLE_USER처럼 작성한 글에는 상세한 내용을 볼 수 있다.
![image](https://github.com/user-attachments/assets/d76739a8-647d-4669-98fd-b38ed50737ac)


ROLE_USER와는 다르게 접근은 허용하나 수정 및 삭제가 불가능하다.
![image](https://github.com/user-attachments/assets/0e1fbb96-5464-4cf4-9629-bb54d1498640)
