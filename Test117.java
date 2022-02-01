/*===============================
	■■■ 클래스 고급 ■■■
	 - 인터페이스(Interface)
  ===============================*/

// ○ 실습문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2108006 홍길동
// 국어 영어 수학 점수 입력 (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2108024 도우너
// 국어 영어 수학 점수 입력 (공백 구분) : 85 70 65

// 2108006 홍길동 90 100 85		275		91
//				  수  수 우
// 2108024 도우너 85 70 65		220		73
//				  우 미 양

// 계속하려면 아무키나 누르세요...


// 속성만 존재하는 클래스 → 자료형 활용


import java.util.Scanner;

class Record
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}


//인터페이스
interface Sungjuk
{
	public void set();		//-- 인원 수 구성
	public void input();	//-- 상세 데이터 입력
	public void print();	//-- 겨과 출력
}


// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	Scanner sc = new Scanner(System.in);

	int num;
	Record[] rc;
	int[][] score;
	char[][] rank;

	
	@Override
	public void set(){		
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1||num>10);


		rc = new Record[num];	
		score = new int[num][3];	// 국영수 점수
		rank = new char[num][3];	// 수우미양가
	}

	@Override
	public void input(){

		for (int i=0; i<num ; i++){
			rc[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", (i+1));
			rc[i].hak = sc.next();	//학번
			rc[i].name = sc.next();	//이름

			System.out.print("국어 영어 수학 점수 입력 (공백 구분) : ");
			score[i][0] = rc[i].kor = sc.nextInt();	//국
			score[i][1] = rc[i].eng = sc.nextInt();	//영
			score[i][2] = rc[i].mat = sc.nextInt();	//수 점수 받기

			
			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat; //총 합
			rc[i].avg = (rc[i].tot)/3;	//평균


			for (int j=0; j<3 ; j++)
			{
				switch (score[i][j] - score[i][j]%10)
				{
					case 10 :case 9 : rank[i][j] = '수';
					case 8 : rank[i][j] = '우'; break;
					case 7 : rank[i][j] = '미'; break;
					case 6 : rank[i][j] = '양'; break;
					default : rank[i][j] = '가'; break;
				
				}
			}//end for(j)
			
		} //end for(i)
	}//end input


	@Override

	public void print(){

		System.out.println();	//개행
		
		for (int i = 0; i<num ; i++){
			System.out.printf("%s	%s	%3d  %3d  %3d	%3d	%3d",rc[i].hak,rc[i].name,rc[i].kor,rc[i].eng,rc[i].mat,rc[i].tot,rc[i].avg);
			System.out.printf("\t\t	%3c  %3c  %3c\n", score[i][0],score[i][1],score[i][2]);
		}

	}
		

} //end SungjukImpl()

public class Test117{
	public static void main(String[]args){
		Sungjuk ob;

		// 문제 해결 과정에서 작성해야 할 ob구성
		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
		
	}
}