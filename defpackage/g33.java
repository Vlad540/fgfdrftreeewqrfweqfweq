package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.List;
import java.util.Map;
import one.me.chats.picker.PickerChatController;
import one.me.profile.screens.avatars.ContactAvatarWidget;
import one.me.profile.screens.avatars.ContactAvatarsScreen;

/* renamed from: g33  reason: default package */
public final class g33 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g33(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public boolean a(MotionEvent motionEvent) {
        ao8 ao8 = (ao8) this.c;
        View view = ao8.M0;
        if (!(view instanceof zq8) || view.getTouchDelegate() == null) {
            return false;
        }
        return ao8.M0.getTouchDelegate().onTouchEvent(motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (!a(motionEvent)) {
                    View view = ((ao8) this.c).M0;
                    ho8 ho8 = view instanceof ho8 ? (ho8) view : null;
                    if (ho8 != null) {
                        ho8.d(motionEvent, ao8.V0);
                    }
                }
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                ubd ubd = (ubd) this.b;
                TouchDelegate touchDelegate = ubd.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false) && ubd.z0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    ubd.getRippleDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    ubd.getBorderDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    ubd.setPressed(true);
                    ubd.invalidate();
                }
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (!a(motionEvent)) {
                    ((sn8) ((ao8) this.c).a).performLongClick();
                    return;
                }
                return;
            case 3:
                super.onLongPress(motionEvent);
                ((s16) this.c).invoke();
                return;
            case 5:
                ubd ubd = (ubd) this.b;
                TouchDelegate touchDelegate = ubd.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    ubd.setPressed(false);
                    ubd.invalidate();
                    ubd.performLongClick();
                    return;
                }
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                dg3 dg3 = (dg3) this.b;
                if (dg3 != null) {
                    k77[] k77Arr = ContactAvatarWidget.X;
                    ContactAvatarWidget contactAvatarWidget = (ContactAvatarWidget) this.c;
                    contactAvatarWidget.getClass();
                    boolean z = false;
                    k77 k77 = ContactAvatarWidget.X[0];
                    ((Number) contactAvatarWidget.b.a(contactAvatarWidget)).longValue();
                    ContactAvatarsScreen contactAvatarsScreen = (ContactAvatarsScreen) dg3;
                    if (contactAvatarsScreen.y0().getVisibility() == 0) {
                        z = true;
                    }
                    contactAvatarsScreen.w0(!z);
                }
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        q13 n;
        String str;
        String str2 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                f33 f33 = (f33) obj2;
                if (f33 != null) {
                    ((ppa) f33).c(((e33) obj).getColor());
                }
                return true;
            case 2:
                if (!a(motionEvent)) {
                    ao8 ao8 = (ao8) obj;
                    View view = ao8.M0;
                    ho8 ho8 = view instanceof ho8 ? (ho8) view : null;
                    if (!(ho8 == null || (n = ho8.n(motionEvent)) == null)) {
                        str2 = n.h();
                    }
                    if (ho8 != null) {
                        ho8.d(motionEvent, ao8.W0);
                    }
                    if (ho8 == null || (!ho8.h(motionEvent) && str2 == null)) {
                        ((sn8) ao8.a).performClick();
                    } else {
                        ((u16) obj2).invoke(str2);
                    }
                }
                return true;
            case 3:
                ((s16) obj2).invoke();
                return true;
            case 4:
                jq8 jq8 = (jq8) obj;
                CharSequence text = jq8.getText();
                String obj3 = text != null ? text.toString() : null;
                k77[] k77Arr = PickerChatController.F0;
                PickerChatController pickerChatController = (PickerChatController) obj2;
                pickerChatController.getClass();
                k77 k77 = PickerChatController.F0[2];
                pickerChatController.X.b(pickerChatController, obj3);
                xra o0 = pickerChatController.o0();
                CharSequence text2 = jq8.getText();
                if (!o0.I0) {
                    o0.I0 = true;
                    List s0 = o23.s0(((Map) o0.y0.a.getValue()).keySet());
                    kbd kbd = (kbd) o0.Y.getValue();
                    if (text2 != null) {
                        if (h0e.c0(text2)) {
                            text2 = null;
                        }
                        if (text2 != null) {
                            str = text2.toString();
                            kbd.b(o0.b, s0, str, (List) null);
                            taf.o(o0.G0, new w03());
                        }
                    }
                    str = null;
                    kbd.b(o0.b, s0, str, (List) null);
                    taf.o(o0.G0, new w03());
                }
                return true;
            case 5:
                ubd ubd = (ubd) obj2;
                TouchDelegate touchDelegate = ubd.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    ubd.setPressed(false);
                    ubd.invalidate();
                    if (ubd.z0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ((s16) obj).invoke();
                    } else {
                        ((View) ubd.getParent()).performClick();
                    }
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }

    public g33(ao8 ao8, yn8 yn8) {
        this.a = 2;
        this.c = ao8;
        this.b = yn8;
    }
}
