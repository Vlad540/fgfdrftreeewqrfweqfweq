package defpackage;

import android.os.Bundle;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.arch.Widget;

/* renamed from: zp5  reason: default package */
public final class zp5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FolderEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zp5(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = folderEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zp5) n((up5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zp5 zp5 = new zp5(this.Y, continuation);
        zp5.X = obj;
        return zp5;
    }

    public final Object o(Object obj) {
        tt6 tt6;
        wx3.H(obj);
        up5 up5 = (up5) this.X;
        boolean z = up5 instanceof rp5;
        jue jue = jue.a;
        Widget widget = this.Y;
        if (z) {
            k77[] k77Arr = FolderEditScreen.w0;
            widget.n0();
            widget.getRouter().C();
            if (((rp5) up5).a && (tt6 = (tt6) as5.a.getAccessor().e()) != null) {
                tt6.f(Collections.singleton(new st6(qt6.CREATE_FOLDER, 1)), mnc.q1);
            }
        } else if (up5 instanceof tp5) {
            String str = ((vgc) o23.e0(widget.getRouter().e())).b;
            if (str == null) {
                return jue;
            }
            widget.n0();
            er5.c.P1().b(me4.j(":settings/folder/members-picker?tag=", str, "&members_ids=", o23.c0(((tp5) up5).a, ",", (String) null, (String) null, (u16) null, 62)), (Bundle) null);
        } else if (up5 instanceof sp5) {
            k77[] k77Arr2 = FolderEditScreen.w0;
            jjd.P(String.valueOf(((dq5) widget.m0().y0.a.getValue()).a()), widget);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue;
    }
}
