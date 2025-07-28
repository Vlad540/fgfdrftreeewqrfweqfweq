package one.me.chatscreen.mediabar.mediatypepicker;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerWidget;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "parentScope", "", "chatId", "(Ljava/lang/String;JLx54;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaTypePickerWidget extends Widget implements lc3 {
    public static final /* synthetic */ k77[] Y;
    public final xg9 X;
    public final jr a;
    public final jr b;
    public final t97 c;
    public final nl0 o;

    static {
        Class<MediaTypePickerWidget> cls = MediaTypePickerWidget.class;
        khb khb = new khb(cls, "chatId", "getChatId()J", 0);
        n7c n7c = m7c.a;
        Y = new k77[]{khb, wn6.e(n7c, cls, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), wn6.f(cls, "root", "getRoot()Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerButtonsView;", 0, n7c)};
    }

    public MediaTypePickerWidget(String str, long j, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str)), new wia("chat_id", Long.valueOf(j))));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget] */
    public final void i(int i, Bundle bundle) {
        if (i == 1) {
            taf.o(l0().b.b, rg8.a);
        } else if (i == 2) {
            try {
                String str = oyb.g;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                startActivityForResult(intent, 373);
                xg9.g(this.X, mnc.Y0);
            } catch (ActivityNotFoundException unused) {
                hba hba = new hba(this);
                hba.i(d8.u(getContext(), cic.D1));
                hba.j();
            }
        }
    }

    public final xg8 l0() {
        return (xg8) this.c.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        dm7 dm7 = null;
        if (i == 371) {
            if (i2 == -1 && intent != null) {
                dm7 serializableExtra = intent.getSerializableExtra("ru.ok.tamtam.extra.LOCATION");
                if (serializableExtra instanceof dm7) {
                    dm7 = serializableExtra;
                }
                if (dm7 == null) {
                    dm7 = dm7.Z;
                }
                dm7 = new hce(dm7, intent.getLongExtra("ru.ok.tamtam.extra.LIVE", 0), intent.getLongExtra("ru.ok.tamtam.extra.ZOOM", 0));
            }
            if (dm7 != null) {
                vg8 vg8 = l0().b;
                taf.o(vg8.b, new tg8(dm7.a, (float) dm7.c, dm7.b));
                taf.o(vg8.b, qg8.a);
            }
        } else if (i != 373) {
            udd.s("MediaTypePickerWidget", "Unexpected onActivityResult code " + i2, (Throwable) null);
        } else if (intent != null && (data = intent.getData()) != null) {
            xg8 l0 = l0();
            xs7.E(l0.a, ((pae) l0.x0.getValue()).b(), (ru3) null, new wg8(data, l0, (Continuation) null), 2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k77 k77 = Y[2];
        return (ng8) this.o.getValue();
    }

    public final void onViewCreated(View view) {
        MediaTypePickerWidget.super.onViewCreated(view);
        grd grd = l0().X;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(grd, getViewLifecycleOwner().R(), ob7), new gh8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().Y, getViewLifecycleOwner().R(), ob7), new hh8((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public MediaTypePickerWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(Long.class, "chat_id");
        this.b = new jr(inc.class, "arg_key_scope_id");
        this.c = createViewModelLazy(xg8.class, new js5(23, new fh8(this, 0)));
        this.o = binding(new fh8(this, 1));
        this.X = (xg9) sl2.a.getAccessor().c(xg9.class);
    }
}
