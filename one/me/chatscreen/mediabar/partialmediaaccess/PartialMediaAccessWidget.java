package one.me.chatscreen.mediabar.partialmediaaccess;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/chatscreen/mediabar/partialmediaaccess/PartialMediaAccessWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PartialMediaAccessWidget extends Widget {
    public static final /* synthetic */ k77[] o;
    public final t97 a;
    public final nl0 b;
    public final nl0 c;

    static {
        Class<PartialMediaAccessWidget> cls = PartialMediaAccessWidget.class;
        o = new k77[]{new khb(cls, "titleSubtitleContent", "getTitleSubtitleContent()Landroid/widget/LinearLayout;", 0), wn6.e(m7c.a, cls, "content", "getContent()Landroid/widget/LinearLayout;", 0)};
    }

    public PartialMediaAccessWidget() {
        this((Bundle) null, 1, (x54) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k77 k77 = o[1];
        return (LinearLayout) this.c.getValue();
    }

    public PartialMediaAccessWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = rna.a.b();
        this.b = binding(new oja(this, 0));
        this.c = binding(new oja(this, 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PartialMediaAccessWidget(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }
}
