package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.profile.ProfileScreen;
import ru.ok.messages.media.attaches.MessageAttachmentsLayout;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* renamed from: wk0  reason: default package */
public final /* synthetic */ class wk0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wk0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onLongClick(View view) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return ((xk0) obj).performLongClick();
            case 1:
                fh3 fh3 = (fh3) obj;
                mod mod = fh3.T0;
                if (mod != null) {
                    long j = fh3.V0;
                    kk9 kk9 = CallHistoryPageScreen.y0;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) mod.b;
                    if (!((c71) callHistoryPageScreen.n0().w0.getValue()).a) {
                        callHistoryPageScreen.o0().C0 = Long.valueOf(j);
                        pfa.a(2).e((List) callHistoryPageScreen.w0.getValue()).j(fh3).g(dh4.c().getDisplayMetrics().density * 12.0f).build().q(callHistoryPageScreen);
                    }
                }
                return fh3.T0 != null;
            case 2:
                ((MediaBarPreviewLayout) obj).X0.getClass();
                return true;
            case 3:
                mn8 mn8 = ((MessageAttachmentsLayout) obj).a;
                in8 in8 = mn8.D0;
                mn8.A0.u(0);
                in8.getClass();
                return true;
            case 4:
                ((ie9) obj).o(new ai0(19));
                return true;
            case 5:
                ((bf9) obj).o(new ai0(19));
                return true;
            case 6:
                ((gf9) obj).o(new ai0(19));
                return true;
            case 7:
                fgb q0 = ((ProfileScreen) ((seb) obj).X).q0();
                taf.o(q0.E0, new afb((List) ((l6b) q0.K0.getValue()).l.getValue()));
                return true;
            case 8:
                return ((ubd) obj).performLongClick();
            case 9:
                return ((vfe) obj).performLongClick();
            default:
                m3f m3f = (m3f) obj;
                Long l = m3f.Z;
                if (l != null) {
                    long longValue = l.longValue();
                    i26 i26 = m3f.X;
                    if (i26 != null) {
                        Long valueOf = Long.valueOf(longValue);
                        ViewGroup viewGroup = (ViewGroup) m3f.b;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        i26.invoke(valueOf, viewGroup);
                    }
                }
                return true;
        }
    }
}
