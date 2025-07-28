package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: nvd  reason: default package */
public final class nvd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nvd(Continuation continuation, StickersScreen stickersScreen, View view) {
        super(2, continuation);
        this.Y = stickersScreen;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nvd nvd = new nvd(continuation, this.Y, this.Z);
        nvd.X = obj;
        return nvd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        StickersScreen stickersScreen = this.Y;
        mvd mvd = stickersScreen.a;
        mvd mvd2 = mvd.SET;
        View view = this.Z;
        Integer num = null;
        if (mvd == mvd2) {
            nl0 nl0 = stickersScreen.Z;
            if (!nl0.a()) {
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    jjd.g((View) nl0.getValue(), viewGroup);
                }
                View view2 = (View) nl0.getValue();
                afa.a(view2, new p36(view2, 23, stickersScreen));
            }
        }
        stickersScreen.y0.E(list);
        boolean isEmpty = list.isEmpty();
        nl0 nl02 = stickersScreen.Y;
        if (isEmpty) {
            ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup2 != null) {
                jjd.g((View) nl02.getValue(), viewGroup2);
            }
            if (nl02.a()) {
                avd avd = (avd) nl02.getValue();
                mvd mvd3 = mvd.RECENT;
                mvd mvd4 = stickersScreen.a;
                avd.setTitle(mvd4 == mvd3 ? sca.c : sca.a);
                if (mvd4 == mvd3) {
                    num = Integer.valueOf(sca.b);
                }
                avd.setSubtitle(num);
                avd.setIcon(qca.b);
            }
            ((View) nl02.getValue()).setVisibility(0);
            stickersScreen.l0().setVisibility(8);
            stickersScreen.m0().setRightActions(yda.a);
        } else {
            stickersScreen.l0().setVisibility(0);
            at7.z(nl02);
            stickersScreen.m0().setRightActions(new cea(new h87(1, this.Y, StickersScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 15)));
        }
        return jue.a;
    }
}
