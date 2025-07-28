package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: wd1  reason: default package */
public final /* synthetic */ class wd1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd1(dud dud, u16 u16) {
        this.a = 4;
        this.c = dud;
        this.b = u16;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        u16 u16;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallOpponentsListWidget.L0;
                if (view instanceof EditText) {
                    EditText editText = (EditText) view;
                    if (motionEvent.getX() >= ((float) (editText.getWidth() - editText.getTotalPaddingRight()))) {
                        if (motionEvent.getAction() != 1) {
                            return true;
                        }
                        ((u16) obj).invoke((EditText) obj2);
                        return true;
                    }
                }
                return false;
            case 1:
                i55 i55 = (i55) obj;
                SpannableString text = i55.getText();
                if (text == null) {
                    return false;
                }
                yz2 yz2 = ((an3) obj2).b;
                Layout textLayout = i55.getTextLayout();
                yz2.getClass();
                if (motionEvent.getAction() == 0) {
                    yz2.d = new afc(new WeakReference(view), textLayout);
                    yz2.e = text;
                }
                return yz2.l.onTouchEvent(motionEvent);
            case 2:
                k77[] k77Arr2 = MessageWriteWidget.J0;
                ((u16) obj).invoke(motionEvent);
                return ((GestureDetector) obj2).onTouchEvent(motionEvent);
            case 3:
                if (motionEvent.getAction() == 1) {
                    Chip chip = (Chip) obj;
                    Drawable chipIcon = chip.getChipIcon();
                    if (motionEvent.getX() <= chip.getChipStartPadding() + ((float) (chipIcon != null ? chipIcon.getIntrinsicWidth() : 0))) {
                        ((s16) obj2).invoke();
                        return true;
                    }
                }
                return false;
            default:
                dud dud = (dud) obj2;
                btc btc = dud.N0;
                btc btc2 = btc instanceof btc ? btc : null;
                if (motionEvent.getAction() == 0 && btc2 != null && btc2.Y && (u16 = (u16) obj) != null) {
                    u16.invoke(dud);
                }
                return false;
        }
    }

    public /* synthetic */ wd1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
