# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

### 요구사항
#### 기능 요구사항 (step1)
* 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: null => 0, “” => 0, "1" => 1, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
* 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 
  커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 
  예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
  - :heavy_check_mark: 커스텀 구분자를 구분해낸다.
    - :heavy_check_mark: 커스텀 구분자를 구분해낼 수 없는 문자열이면 IllegalArgumentsException
  - :heavy_check_mark: 구분자 부분이 제외된 나머지 문자열을 구분해낸다.
  - 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리 
    - :heavy_check_mark: 쉼표만으로 구분된 문자열이 들어온 경우 : 분리 가능
    - :heavy_check_mark: 콜론만으로 구분된 문자열이 들어온 경우 : 분리 가능
    - :heavy_check_mark: 쉼표와 콜론이 섞여있는 경우 : 분리 가능
    - :heavy_check_mark: 쉼표, 콜론 외의 커스텀 구분자가 함께 들어온 경우 : 분리 가능
    - :heavy_check_mark: 위의 기준으로 분리가 가능하면 쉼표와 콜론으로 문자열을 분리한다.
  - :heavy_check_mark: 분리해낸 커스텀 구분자로 문자열을 split 하면 정상적으로 split 된다.
  - :heavy_check_mark: 분리해낸 커스텀 구분자와 쉼표(,), 콜론(:) 이 섞여있는 경우 정상적으로 split 된다.
  - :heavy_check_mark: 커스텀 구분자가 2자리 이상인 경우 : 불가 (이전 조건에 존재하지 않아 추가)
  - :heavy_check_mark: 위에서 분리된 숫자의 합을 반환.
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
  - :heavy_check_mark: 숫자가 아닌 문자열이 포함된 경우 : 불가능
  - :heavy_check_mark: 음수면 : 불가능
 
#### 프로그래밍 요구사항
* indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
  * depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
* 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
  * method가 한 가지 일만 하도록 최대한 작게 만들어라.
* else를 사용하지 마라.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 질문
* 한 클래스 내부에서 인스턴스 변수를 사용할 때 인스턴스 변수 앞에 반드시 this 를 사용해야 하는가?
* test 코드 작성시 given-when-then 을 반드시 작성하는가?