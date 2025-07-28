package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: v6e  reason: default package */
public final class v6e extends FrameLayout implements d7e {
    public final /* synthetic */ e7e a = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [e7e, java.lang.Object] */
    public v6e(Context context) {
        super(context);
    }

    public final void a() {
        this.a.a();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public s16 getOnRequestInterceptTouchEvent() {
        return this.a.b;
    }

    public u16 getOnTouch() {
        return this.a.a;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        u16 onTouch = this.a.getOnTouch();
        return (onTouch != null ? ((Boolean) onTouch.invoke(motionEvent)).booleanValue() : false) || Boolean.valueOf(super.onInterceptTouchEvent(motionEvent)).booleanValue();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u16 onTouch = this.a.getOnTouch();
        return (onTouch != null ? ((Boolean) onTouch.invoke(motionEvent)).booleanValue() : false) || Boolean.valueOf(super.onTouchEvent(motionEvent)).booleanValue();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        a();
    }

    public void setOnRequestInterceptTouchEvent(s16 s16) {
        this.a.b = s16;
    }

    public void setOnTouch(u16 u16) {
        this.a.a = u16;
    }
}
