package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.messages.location.ActLocationMap;

/* renamed from: hh8  reason: default package */
public final class hh8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaTypePickerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hh8(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.Y = mediaTypePickerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hh8) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hh8 hh8 = new hh8(continuation, this.Y);
        hh8.X = obj;
        return hh8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean f = hhd.f(a34, og8.b);
        ygc ygc = this.Y;
        if (f) {
            k77[] k77Arr = MediaTypePickerWidget.Y;
            Context context = ygc.getContext();
            k77 k77 = MediaTypePickerWidget.Y[0];
            long longValue = ((Number) ygc.a.a(ygc)).longValue();
            int i = ActLocationMap.Y0;
            Intent intent = new Intent(context, ActLocationMap.class);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", longValue);
            intent.putExtra("map:DISABLE_LIVE", false);
            intent.putExtra("map:REGULAR_SENDING", true);
            ygc.startActivityForResult(intent, 371);
        } else if (hhd.f(a34, pg8.b)) {
            k77[] k77Arr2 = MediaTypePickerWidget.Y;
            ygc.getClass();
            k77[] k77Arr3 = BottomSheetWidget.B0;
            sgc sgc = null;
            jc3 c = rf0.c(k2a.H, 6, (Bundle) null);
            c.a(new kc3[]{new kc3(1, new hge(k2a.G), 3, false)});
            c.a(new kc3[]{new kc3(2, new hge(k2a.F), 3, false)});
            c.a(new kc3[]{new kc3(3, new hge(k2a.E), 1, false)});
            ConfirmationBottomSheet e = c.e();
            e.setTargetController(ygc);
            ygc ygc2 = ygc;
            while (ygc2.getParentController() != null) {
                ygc2 = ygc2.getParentController();
            }
            ygc ygc3 = ygc2 instanceof ygc ? ygc2 : null;
            if (ygc3 != null) {
                sgc = ygc3.S();
            }
            e.y0(ygc);
            if (sgc != null) {
                vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc, true, "BottomSheetWidget");
                sgc.G(vgc);
            }
        } else if (a34 instanceof a34) {
            ul2.c.R1(a34);
        }
        return jue.a;
    }
}
