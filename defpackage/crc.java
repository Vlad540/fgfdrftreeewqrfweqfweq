package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: crc  reason: default package */
public final class crc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ SearchMessageBottomWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public crc(View view, SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = view;
        this.Z = searchMessageBottomWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((crc) n((yrc) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        crc crc = new crc(this.Y, this.Z, continuation);
        crc.X = obj;
        return crc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        yrc yrc = (yrc) this.X;
        boolean z = yrc instanceof urc;
        this.Y.setVisibility(z ? 0 : 8);
        if (!(yrc instanceof vrc) && !(yrc instanceof wrc)) {
            if (z) {
                urc urc = (urc) yrc;
                k77[] k77Arr = SearchMessageBottomWidget.w0;
                SearchMessageBottomWidget searchMessageBottomWidget = this.Z;
                AppCompatTextView m0 = searchMessageBottomWidget.m0();
                Context context = searchMessageBottomWidget.getContext();
                int i = urc.a;
                m0.setText(i == 0 ? context.getString(k2a.g) : context.getString(k2a.h, new Object[]{Integer.valueOf(urc.b), Integer.valueOf(i)}));
                boolean z2 = urc.c;
                searchMessageBottomWidget.Y = z2;
                searchMessageBottomWidget.q0(searchMessageBottomWidget.o0(), z2);
                boolean z3 = urc.d;
                searchMessageBottomWidget.Z = z3;
                searchMessageBottomWidget.q0(searchMessageBottomWidget.l0(), z3);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
