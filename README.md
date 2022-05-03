# 도서관리 프로그램(FILE 입출력) 

## 1)개요

도서관리 프로그램을 파일 입출력을 이용해서 프로그램이 종료되더라도 결과들이 저장될 수 있도록 만들었습니다. 

## 2)기능

도서관리 프로그램을 이용하기 위해서는 회원가입이 필요하고 로그인을 하게 되면 도서관리 프로그램에 구현된 기능들을 사용할 수 있게 됩니다. 

회원가입, 로그인, 도서 대출, 도서 반납, 책 입고와 책 목록에서의 제거, 비밀번호 찾기, 회원정보 수정 등의 기능을 이용할 수 있습니다. 

그리고 도서정보를 초기화하기 위하여 초기화 창을 만들어 정보가 초기화 될 수 있도록 하였습니다. 

책 입고와 제거를 하기 위해서는 매니저 아이디로만 로그인을 해야만 합니다. 

## 3)구현 방법

In-memory 방식에서와 다르게 ArrayList만을 이용해 프로그램을 구현하였습니다. 회원정보와 책에 관한 정보들을 전부 ArrayList를 생성하여 저장하였습니다. 

ArrayList의 특성상 그렇게 되면 책이 중복되더라도 여러 권을 저장할 수 있고, 하나씩 누군가 책을 빌려가더라도 동일한 책이 1권씩 제거되어 

책의 권수를 지정할 수 있고, 관리에 용이합니다. 

ArrayList는 배열과 달리 크기를 유연하게 정할 수 있다는 장점이 있습니다. 

그리고 파일 입출력 API를 이용해서 책의 도서 목록.txt와 유저 목록.txt를 만들어 프로그램이 종료되더라도 파일은 저장되어 제 컴퓨터에 남아있게 됩니다. 

프로그램을 실행하면 다시 파일들을 불러 들어와서 활용할 수 있습니다. 

## 4)시연 동영상

도서관리 프로그램 시연 영상입니다.

<iframe width="853" height="480" src="https://www.youtube.com/embed/YS1G5wik_eo" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>