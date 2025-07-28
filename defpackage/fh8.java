package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: fh8  reason: default package */
public final /* synthetic */ class fh8 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaTypePickerWidget b;

    public /* synthetic */ fh8(MediaTypePickerWidget mediaTypePickerWidget, int i) {
        this.a = i;
        this.b = mediaTypePickerWidget;
    }

    public final Object invoke() {
        boolean z = true;
        MediaTypePickerWidget mediaTypePickerWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MediaTypePickerWidget.Y;
                k77 k77 = k77Arr[1];
                k77 k772 = k77Arr[0];
                return new xg8((vg8) mediaTypePickerWidget.getSharedViewModel-cp94BC8(((inc) mediaTypePickerWidget.b.a(mediaTypePickerWidget)).a, vg8.class, (s16) null).getValue(), ((Number) mediaTypePickerWidget.a.a(mediaTypePickerWidget)).longValue());
            default:
                k77[] k77Arr2 = MediaTypePickerWidget.Y;
                ng8 ng8 = new ng8(mediaTypePickerWidget.getContext());
                xg8 l0 = mediaTypePickerWidget.l0();
                l0.getClass();
                lg7 c = hwf.c();
                c.add(ah8.a);
                i22 i22 = (i22) ((bv2) l0.w0.getValue()).m(l0.c).a.getValue();
                t97 t97 = l0.Z;
                if (i22 != null) {
                    boolean z2 = i22.b.a != 0;
                    if (!i22.J() || i22.F()) {
                        z = false;
                    }
                    vqc vqc = (xzc) t97.getValue();
                    vqc.getClass();
                    if (vqc.o(PmsKey.money-transfer-botid, 0) != 0 && z && z2) {
                        c.add(ch8.a);
                    }
                }
                vqc vqc2 = (xzc) t97.getValue();
                vqc2.getClass();
                if (vqc2.m(PmsKey.send-location-enabled, false)) {
                    c.add(bh8.a);
                }
                c.add(yg8.a);
                c.add(zg8.a);
                ng8.setState(hwf.a(c));
                ng8.setOnClickListener(new h87(1, mediaTypePickerWidget.l0(), xg8.class, "onButtonClicked", "onButtonClicked(Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerViewState$Button;)V", 0, 1));
                if (ng8.isAttachedToWindow()) {
                    ng8.setPadding(ng8.getPaddingLeft(), ng8.getPaddingTop(), ng8.getPaddingRight(), a24.X((nsf.f((View) null, ng8.getRootWindowInsets()).a.f(2).d > 0 ? (float) 2 : (float) 8) * dh4.c().getDisplayMetrics().density));
                } else {
                    ng8.addOnAttachStateChangeListener(new q40(ng8, 5, ng8));
                }
                return ng8;
        }
    }
}
