package defpackage;

import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: x4c  reason: default package */
public final /* synthetic */ class x4c implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordExitBottomSheet b;

    public /* synthetic */ x4c(RecordExitBottomSheet recordExitBottomSheet, int i) {
        this.a = i;
        this.b = recordExitBottomSheet;
    }

    /* JADX WARNING: type inference failed for: r9v16, types: [android.widget.TextView, android.widget.CompoundButton, android.view.View, pw2, java.lang.Object, androidx.appcompat.widget.AppCompatCheckBox] */
    public final Object invoke() {
        v0a v0a = v0a.c;
        qda qda = qda.a;
        RecordExitBottomSheet recordExitBottomSheet = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = RecordExitBottomSheet.K0;
                return xy6.n(recordExitBottomSheet.getContext());
            case 1:
                k77[] k77Arr2 = RecordExitBottomSheet.K0;
                TextView textView = new TextView(recordExitBottomSheet.getContext());
                textView.setId(o1a.g1);
                nge.d(nte.c, textView);
                textView.setTextColor(-855638017);
                textView.setGravity(17);
                textView.setPadding(0, a24.X(((float) 24) * dh4.c().getDisplayMetrics().density), 0, 0);
                return textView;
            case 2:
                k77[] k77Arr3 = RecordExitBottomSheet.K0;
                TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                textView2.setId(o1a.f1);
                nge.d(nte.o, textView2);
                textView2.setTextColor(1895825407);
                textView2.setGravity(17);
                return textView2;
            case 3:
                k77[] k77Arr4 = RecordExitBottomSheet.K0;
                OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), (AttributeSet) null);
                oneMeButton.setId(o1a.b1);
                oneMeButton.setAppearance(s0a.b);
                oneMeButton.setSize(v0a);
                oneMeButton.setCustomTheme(qda);
                return oneMeButton;
            case 4:
                k77[] k77Arr5 = RecordExitBottomSheet.K0;
                OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), (AttributeSet) null);
                oneMeButton2.setId(o1a.c1);
                oneMeButton2.setAppearance(s0a.c);
                oneMeButton2.setSize(v0a);
                oneMeButton2.setCustomTheme(qda);
                return oneMeButton2;
            case 5:
                k77[] k77Arr6 = RecordExitBottomSheet.K0;
                n7d n7d = new n7d(recordExitBottomSheet.getContext(), (AttributeSet) null);
                n7d.setDisableStartIconText(true);
                int i = o1a.d1;
                n7d.setId(i);
                n7d.setItemId((long) i);
                Drawable b2 = gq3.b(recordExitBottomSheet.getContext(), n1a.g0);
                if (b2 != null) {
                    um4.g(b2, -48049);
                    um4.i(b2, PorterDuff.Mode.SRC_IN);
                }
                n7d.setStartIcon(b2);
                n7d.setType(d7d.b);
                float[] fArr = new float[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    fArr[i2] = dh4.c().getDisplayMetrics().density * 16.0f;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(qda.c.a.g);
                n7d.setBackground(shapeDrawable);
                n7d.setThemeDepended(j7d.b);
                return n7d;
            default:
                k77[] k77Arr7 = RecordExitBottomSheet.K0;
                ? appCompatCheckBox = new AppCompatCheckBox(recordExitBottomSheet.getContext(), (AttributeSet) null);
                appCompatCheckBox.setId(o1a.e1);
                appCompatCheckBox.setText(r1a.m1);
                nge.d(nte.i, appCompatCheckBox);
                appCompatCheckBox.setTextColor(-855638017);
                t97 t97 = recordExitBottomSheet.C0;
                xy6.g((StateListDrawable) t97.getValue(), qda);
                appCompatCheckBox.setButtonDrawable((Drawable) (StateListDrawable) t97.getValue());
                appCompatCheckBox.setChecked(false);
                appCompatCheckBox.setVisibility(8);
                appCompatCheckBox.setPaddingBetweenCheckbox(a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
                return appCompatCheckBox;
        }
    }
}
