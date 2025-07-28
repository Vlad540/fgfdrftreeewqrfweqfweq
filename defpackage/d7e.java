package defpackage;

/* renamed from: d7e  reason: default package */
public interface d7e {
    void a() {
        s16 onRequestInterceptTouchEvent = getOnRequestInterceptTouchEvent();
        if (onRequestInterceptTouchEvent != null) {
            onRequestInterceptTouchEvent.invoke();
        }
    }

    s16 getOnRequestInterceptTouchEvent();

    u16 getOnTouch();

    void setOnRequestInterceptTouchEvent(s16 s16);

    void setOnTouch(u16 u16);
}
