/**
 * Created by wangz on 2017/9/25.
 */
public class DispatchLogic {
    boolean clickable;
    boolean longClickable;
    //View dispatchTouchEvent()
    //View没有onInterceptTouchEvent
    public boolean dispatchTouchEvent(int FLAG_VIEW){
        //onTouch()默认是false，除非用户实现了onTouchListener接口
        if(onTouch())
            return onTouch();
        else {
            return onTouchEvent();
        }
    }
    //ViewGroup dispatchTouchEvent()
    public boolean dispatchTouchEvent(short FLAG_VIEW_GROUP){
        boolean consume = false;
        if (onInterceptTouchEvent()) {
            consume = onTouchEvent();
        } else {
            //child view dispatchTouchEvent method
            consume = dispatchTouchEvent(5);
            //if your child can't handle, parent view take over it;
            if(!consume)
                onTouchEvent();
        }
        return consume;
    }

    private boolean onInterceptTouchEvent() {
        //默认返回false
        return false;
    }


    private void onClick() {
    }

    private boolean onTouchEvent() {
        if (clickable || longClickable) {
            onClick();
            return true;
        } else
            return false;
    }

    private boolean onTouch() {
        return false;
    }
}
