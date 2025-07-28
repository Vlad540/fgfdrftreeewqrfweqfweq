package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/SaveToGalleryDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class SaveToGalleryDialog extends FrgDlgBase {
    public static final SaveToGalleryDialog o1(String str, boolean z) {
        SaveToGalleryDialog saveToGalleryDialog = new SaveToGalleryDialog();
        saveToGalleryDialog.Y0(jjd.j(new wia[]{new wia("ru.ok.tamtam.extra.EXTRA_URL", str), new wia("ru.ok.tamtam.extra.EXTRA_GIF", Boolean.valueOf(z))}));
        return saveToGalleryDialog;
    }

    public final Dialog i1() {
        wce wce;
        if (urd.k(c0())) {
            q1();
        } else {
            urd.I(this, urd.v(), 157);
        }
        LayoutInflater layoutInflater = this.d1;
        if (layoutInflater == null) {
            layoutInflater = S0();
        }
        View inflate = layoutInflater.inflate(zrb.dialog_progress_with_text, (ViewGroup) null);
        AppCompatTextView findViewById = inflate.findViewById(yqb.dialog_progress__text);
        findViewById.setText(i0(cic.q2));
        if (findViewById.isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context = findViewById.getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context);
        }
        findViewById.setTextColor(wce.F);
        return new ov7(V0()).f(inflate).a();
    }

    public final void n1(int i, String[] strArr, int[] iArr) {
        if (i == 157) {
            r5 r5Var = (c0() == null || c0().isFinishing()) ? null : (r5) c0();
            if (r5Var != null) {
                if (urd.R(r5Var, (a) null, strArr, iArr, urd.v(), cic.e2, cic.d2)) {
                    q1();
                    return;
                }
            }
            f1();
        }
    }

    public final void p1(boolean z) {
        o2a o2a;
        aq aqVar;
        v2b v2b = this.I1;
        if (!(v2b == null || (o2a = (k93) v2b.b) == null || (aqVar = (aq) o2a.getAccessor().c(aq.class)) == null || !((kdf) aqVar).c())) {
            a06.H(0, V0(), i0(z ? cic.s2 : cic.r2));
        }
        f1();
    }

    public final void q1() {
        String string = U0().getString("ru.ok.tamtam.extra.EXTRA_URL");
        if (string == null) {
            p1(false);
            return;
        }
        xs7.E(xs7.A(this), (hu3) null, (ru3) null, new ckc(this, string, U0().getBoolean("ru.ok.tamtam.extra.EXTRA_GIF"), (Continuation) null), 3);
    }
}
