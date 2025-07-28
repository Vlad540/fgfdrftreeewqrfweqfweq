package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* renamed from: um2  reason: default package */
public final class um2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ i22 Z;
    public final /* synthetic */ nn2 w0;
    public final /* synthetic */ Long x0;
    public final /* synthetic */ pt8 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public um2(String str, i22 i22, nn2 nn2, Long l, pt8 pt8, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = i22;
        this.w0 = nn2;
        this.x0 = l;
        this.y0 = pt8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((um2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new um2(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        String str;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            i22 i22 = this.Z;
            Pattern pattern = i22.J() ? ehe.c : ehe.e;
            Pattern pattern2 = gla.a;
            String str2 = this.Y;
            Matcher matcher = pattern.matcher(str2);
            loop0:
            while (true) {
                str = str2;
                while (matcher.find()) {
                    Matcher matcher2 = pattern2.matcher(str);
                    boolean z = false;
                    while (matcher2.find() && matcher2.start() <= matcher.end()) {
                        if (matcher2.group().contains(matcher.group())) {
                            z = true;
                        }
                    }
                    if (!z && matcher.group().contains("/﻿")) {
                        str2 = str.replace(matcher.group(), matcher.group().replace("/﻿", String.valueOf('/')));
                    }
                }
                break loop0;
            }
            h29 h29 = this.w0.x0;
            pt8 pt8 = this.y0;
            jv5 a = pt8 != null ? pt8.a() : null;
            this.X = 1;
            if (h29.b(h29, i22.a, str, this.x0, a, this, 16) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
