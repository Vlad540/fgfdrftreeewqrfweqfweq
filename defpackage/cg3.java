package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import one.me.chats.picker.PickerChatController;
import one.me.profile.screens.avatars.ContactAvatarWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: cg3  reason: default package */
public final /* synthetic */ class cg3 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GestureDetector b;

    public /* synthetic */ cg3(GestureDetector gestureDetector, int i) {
        this.a = i;
        this.b = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ContactAvatarWidget.X;
                if (motionEvent != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return false;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 1:
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            case 2:
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            case 3:
                return gestureDetector.onTouchEvent(motionEvent);
            case 4:
                return gestureDetector.onTouchEvent(motionEvent);
            case 5:
                return gestureDetector.onTouchEvent(motionEvent);
            case 6:
                k77[] k77Arr2 = MessageWriteWidget.J0;
                return gestureDetector.onTouchEvent(motionEvent);
            case 7:
                k77[] k77Arr3 = PickerChatController.F0;
                return gestureDetector.onTouchEvent(motionEvent);
            case 8:
                return gestureDetector.onTouchEvent(motionEvent);
            default:
                return gestureDetector.onTouchEvent(motionEvent);
        }
    }
}
