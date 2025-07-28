package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/VideoQualityPickerDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class VideoQualityPickerDialog extends FrgDlgBase {
    public static final VideoQualityPickerDialog o1(ArrayList arrayList, qjb qjb, boolean z) {
        VideoQualityPickerDialog videoQualityPickerDialog = new VideoQualityPickerDialog();
        t23.J(arrayList, rjb.g);
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ujb((rjb) it.next()));
        }
        videoQualityPickerDialog.Y0(jjd.j(new wia[]{new wia("ru.ok.tamtam.extra.QUALITIES", arrayList2), new wia("ru.ok.tamtam.extra.CURRENT_QUALITY", qjb), new wia("ru.ok.tamtam.extra.SHOW_SIZE", Boolean.valueOf(z))}));
        return videoQualityPickerDialog;
    }

    public final Dialog i1() {
        int i;
        boolean z = true;
        ArrayList<ujb> parcelableArrayList = U0().getParcelableArrayList("ru.ok.tamtam.extra.QUALITIES");
        boolean z2 = U0().getBoolean("ru.ok.tamtam.extra.SHOW_SIZE");
        qjb qjb = (qjb) U0().getSerializable("ru.ok.tamtam.extra.CURRENT_QUALITY");
        if (qjb != null) {
            Iterator it = parcelableArrayList.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((ujb) it.next()).a.a == qjb) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        Context V0 = V0();
        r7e r7e = wce.a0;
        wce E = fja.E(V0);
        ArrayList arrayList = new ArrayList(q23.H(parcelableArrayList, 10));
        for (ujb ujb : parcelableArrayList) {
            rjb rjb = ujb.a;
            boolean z3 = rjb.f;
            SpannableStringBuilder append = new SpannableStringBuilder().append(rjb.a.a);
            if (z2) {
                String w = dhe.w(rjb.e, z, (Context) null);
                append.append(' ').append(z3 ? rf0.h("– ", w) : rf0.h("~ ", w), new ForegroundColorSpan(E.M), 34);
            }
            if (z3) {
                append.append(' ').append(rf0.h("– ", i0(cic.M1)), new ForegroundColorSpan(E.M), 17);
            }
            arrayList.add(append);
            z = true;
        }
        ov7 e = new ov7(V0()).e(i0(cic.r3));
        x06 x06 = new x06(this, parcelableArrayList, 5);
        pc pcVar = e.a;
        pcVar.p = (CharSequence[]) arrayList.toArray(new SpannableStringBuilder[0]);
        pcVar.r = x06;
        pcVar.u = i;
        pcVar.t = true;
        String i0 = i0(cic.r);
        g00 g00 = new g00(4, this);
        pc pcVar2 = e.a;
        pcVar2.k = i0;
        pcVar2.l = g00;
        return e.a();
    }

    public final void p1(w7f w7f) {
        udd.q("ru.ok.messages.views.dialogs.VideoQualityPickerDialog", "set fragment result " + w7f);
        g0().e0("VideoQualityPickerDialog:result:request", jjd.j(new wia[]{new wia("VideoQualityPickerDialog:result:key", w7f)}));
        g1(false, false);
    }
}
