package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: jg1  reason: default package */
public final /* synthetic */ class jg1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jg1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        ViewParent parent2;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                smc smc = CallScreen.T0;
                if (motionEvent == null) {
                    return false;
                }
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
                    if (motionEvent.getAction() != 1 || eventTime >= 100) {
                        return false;
                    }
                    CallScreen callScreen = (CallScreen) obj;
                    if (!callScreen.z0().q(callScreen.u0().g)) {
                        return false;
                    }
                    CallScreen.o0(callScreen);
                }
                return true;
            case 1:
                int action = motionEvent.getAction();
                View view2 = ((po3) obj).a;
                if (!((action != 0 && action != 2) || (parent = view2.getParent()) == null || (parent2 = parent.getParent()) == null)) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return view2.onTouchEvent(motionEvent);
            case 2:
                kp4 kp4 = (kp4) obj;
                kp4.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kp4.o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kp4.m = false;
                    }
                    kp4.u();
                    kp4.m = true;
                    kp4.o = System.currentTimeMillis();
                }
                return false;
            case 3:
                k77[] k77Arr = MessageWriteWidget.J0;
                nu8 u0 = ((MessageWriteWidget) obj).u0();
                u0.getClass();
                taf.o(u0.X0, new ut8(z2c.a, motionEvent));
                return true;
            case 4:
                EditText editText = (EditText) obj;
                Drawable drawable = editText.getCompoundDrawables()[2];
                if (drawable == null || motionEvent.getRawX() < ((float) (((editText.getRight() - editText.getPaddingRight()) - drawable.getBounds().width()) - editText.getCompoundDrawablePadding()))) {
                    return false;
                }
                int action2 = motionEvent.getAction();
                if (action2 != 0) {
                    if (action2 != 1) {
                        return false;
                    }
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                }
                return true;
            case 5:
                return ((Boolean) ((i26) obj).invoke(view, motionEvent)).booleanValue();
            default:
                ScaleGestureDetector scaleGestureDetector = ((VideoMessageWidget) obj).x0;
                if (scaleGestureDetector != null) {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                }
                return true;
        }
    }
}
