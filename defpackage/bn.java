package defpackage;

import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: bn  reason: default package */
public final class bn extends ContentFrameLayout {
    public final /* synthetic */ dn A0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bn(dn dnVar, ar3 ar3) {
        super(ar3, (AttributeSet) null);
        this.A0 = dnVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A0.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                dn dnVar = this.A0;
                dnVar.q(dnVar.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(am7.n(getContext(), i));
    }
}
