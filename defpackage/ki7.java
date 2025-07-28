package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.views.widgets.EllipsizingEndTextView;
import ru.ok.messages.views.widgets.ImageSpanEllipsizedTextView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: ki7  reason: default package */
public final class ki7 extends b7c implements xhe {
    public final ImageView J0;
    public final ImageSpanEllipsizedTextView K0;
    public final EllipsizingEndTextView L0;

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.TextView, android.view.View, ru.ok.messages.views.widgets.ImageSpanEllipsizedTextView] */
    public ki7(li7 li7, View view) {
        super(view);
        TamAvatarView tamAvatarView = (TamAvatarView) view.findViewById(yqb.row_chat_location__vw_avatar);
        ImageView imageView = (ImageView) view.findViewById(yqb.row_chat_location__stop);
        this.J0 = imageView;
        ? r0 = (ImageSpanEllipsizedTextView) view.findViewById(yqb.row_chat_location__tv_title);
        this.K0 = r0;
        new yge(r0, e07.a(r0.getContext())).a();
        this.L0 = (EllipsizingEndTextView) view.findViewById(yqb.row_chat_location__tv_subtitle);
        at7.i(view, new f5(10, this));
        at7.i(imageView, new f5(10, this));
        c();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.TextView, ru.ok.messages.views.widgets.ImageSpanEllipsizedTextView] */
    /* JADX WARNING: type inference failed for: r4v1, types: [ru.ok.messages.views.widgets.EllipsizingEndTextView, android.widget.TextView] */
    public final void c() {
        View view = this.a;
        Context context = view.getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        view.setBackground(swb.C(0, E.i));
        RippleDrawable a = E.a();
        ImageView imageView = this.J0;
        imageView.setBackground(a);
        imageView.setColorFilter(E.M, PorterDuff.Mode.SRC_IN);
        this.K0.setTextColor(E.F);
        this.L0.setTextColor(E.J);
    }
}
