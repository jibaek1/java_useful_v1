package generic.ch04;

/**
 * 도전 과제
 * 제네릭 클래스 Box 설계 <T> 대체 문자열을 설계해보세요
 */
public class Box<T> {

    // 변수 선언
    T item;

    // 생성자 선언
    public Box(T item) {
        this.item = item;
    }

    // 내용물 설정 (set 메서드)
    public void setItem(T item){
        this.item = item;
    }

    // 내용물 반환 (get 메서드)
    public T getItem() {
        return item;
    }

    // 내용물 출력 (sout...)

    @Override
    public String toString() {
        return item.toString();
    }
}
