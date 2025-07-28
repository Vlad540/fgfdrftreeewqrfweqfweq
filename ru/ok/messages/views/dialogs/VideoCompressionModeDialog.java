package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoCompressionModeDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class VideoCompressionModeDialog extends FrgDlgBase {
    public final Dialog i1() {
        pz4 pz4 = n2f.Y;
        pz4.getClass();
        n2f[] n2fArr = (n2f[]) n06.E(pz4, new n2f[0]);
        ArrayList arrayList = new ArrayList(n2fArr.length);
        for (n2f n2f : n2fArr) {
            arrayList.add(n2f.a.a);
        }
        ov7 e = new ov7(V0()).e(i0(cic.j1));
        x06 x06 = new x06(this, n2fArr, 4);
        pc pcVar = e.a;
        pcVar.p = (CharSequence[]) arrayList.toArray(new String[0]);
        pcVar.r = x06;
        return e.a();
    }
}
