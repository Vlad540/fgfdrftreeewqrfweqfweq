package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: jq5  reason: default package */
public final class jq5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ rq5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jq5(rq5 rq5, Continuation continuation) {
        super(2, continuation);
        this.Y = rq5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jq5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jq5(this.Y, continuation);
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r7.X
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            defpackage.wx3.H(r8)
            goto L_0x0077
        L_0x000d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0015:
            defpackage.wx3.H(r8)
            rq5 r8 = r7.Y
            ep5 r8 = r8.E0
            rq5 r1 = r7.Y
            java.util.concurrent.atomic.AtomicReference r1 = r1.C0
            java.lang.Object r1 = r1.get()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.q23.H(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r1.next()
            i22 r4 = (i22) r4
            o62 r4 = r4.b
            long r4 = r4.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r3.add(r6)
            goto L_0x0035
        L_0x004e:
            rq5 r1 = r7.Y
            java.lang.String r1 = r1.b
            if (r1 == 0) goto L_0x005c
            if (r8 == 0) goto L_0x005c
            java.util.Set r8 = r8.z0
            java.util.LinkedHashSet r3 = defpackage.z3d.I(r8, r3)
        L_0x005c:
            rq5 r8 = r7.Y
            pae r8 = r8.o
            n3a r8 = (defpackage.n3a) r8
            ju3 r8 = r8.b()
            iq5 r1 = new iq5
            rq5 r4 = r7.Y
            r5 = 0
            r1.<init>(r3, r4, r5)
            r7.X = r2
            java.lang.Object r8 = defpackage.xs7.U(r8, r1, r7)
            if (r8 != r0) goto L_0x0077
            return r0
        L_0x0077:
            java.util.List r8 = (java.util.List) r8
            rq5 r7 = r7.Y
            l05 r7 = r7.B0
            tp5 r0 = new tp5
            r0.<init>(r8)
            taf.o(r7, r0)
            jue r7 = defpackage.jue.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq5.o(java.lang.Object):java.lang.Object");
    }
}
