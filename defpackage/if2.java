package defpackage;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: if2  reason: default package */
public final /* synthetic */ class if2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    public /* synthetic */ if2(ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        this.a = i;
        this.b = chatMediaViewerScreen;
    }

    public final Object invoke() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatMediaViewerScreen.O0;
                fb2 fb2 = fb2.a;
                r7e d = fb2.getAccessor().d(bv2.class);
                r7e d2 = fb2.getAccessor().d(wa2.class);
                r7e d3 = fb2.getAccessor().d(l3a.class);
                r7e d4 = fb2.getAccessor().d(ap3.class);
                r7e d5 = fb2.getAccessor().d(w6a.class);
                r7e d6 = fb2.getAccessor().d(c4f.class);
                r7e d7 = fb2.getAccessor().d(okc.class);
                r7e d8 = fb2.getAccessor().d(xy5.class);
                r7e d9 = fb2.getAccessor().d(jb5.class);
                widget.getClass();
                k77[] k77Arr2 = ChatMediaViewerScreen.O0;
                k77 k77 = k77Arr2[0];
                jr jrVar = widget.o;
                long longValue = ((Number) jrVar.a(widget)).longValue();
                k77 k772 = k77Arr2[1];
                k77 k773 = k77Arr2[2];
                Class<pae> cls = pae.class;
                k77 k774 = k77Arr2[3];
                boolean booleanValue = ((Boolean) widget.Z.a(widget)).booleanValue();
                k77 k775 = k77Arr2[4];
                boolean booleanValue2 = ((Boolean) widget.w0.a(widget)).booleanValue();
                pk pkVar = (pk) fb2.getAccessor().c(pk.class);
                k77 k776 = k77Arr2[0];
                return new ah2(d, d2, d3, d4, d5, d6, d7, d8, d9, longValue, (String) widget.X.a(widget), ((Number) widget.Y.a(widget)).longValue(), booleanValue, booleanValue2, (Context) fb2.getAccessor().c(Context.class), (b29) fb2.getAccessor().c(b29.class), (pae) fb2.getAccessor().c(cls), pkVar, new ew8(((Number) jrVar.a(widget)).longValue(), (tt0) fb2.getAccessor().c(tt0.class), (pae) fb2.getAccessor().c(cls)));
            default:
                k77[] k77Arr3 = ChatMediaViewerScreen.O0;
                k7f k7f = ((eid) fb2.a.getAccessor().d(eid.class).getValue()).get();
                if (widget.getView() != null) {
                    k68 k68 = (k68) o23.Y(((ViewPager2) widget.B0.T0(widget, ChatMediaViewerScreen.O0[5])).getCurrentItem(), widget.H0.C0.f);
                    b68 b68 = k68 instanceof b68 ? (b68) k68 : null;
                    if (b68 != null && b68.X) {
                        k7f.g(0.0f);
                        k7f.K0(false);
                        k7f.Y = new ea6(8, widget);
                        return k7f;
                    }
                }
                if (widget.K0 < 0.0f && k7f.e() == 0.0f) {
                    k7f.g(1.0f);
                }
                k7f.K0(false);
                k7f.Y = new ea6(8, widget);
                return k7f;
        }
    }
}
