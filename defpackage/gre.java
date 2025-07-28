package defpackage;

import java.util.ArrayList;

/* renamed from: gre  reason: default package */
public final class gre extends fre {
    public final /* synthetic */ yr a;
    public final /* synthetic */ hre b;

    public gre(hre hre, yr yrVar) {
        this.b = hre;
        this.a = yrVar;
    }

    public final void c(cre cre) {
        ((ArrayList) this.a.get(this.b.b)).remove(cre);
        cre.E(this);
    }
}
