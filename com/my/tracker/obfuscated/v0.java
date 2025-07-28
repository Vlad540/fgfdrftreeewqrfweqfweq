package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.j0;
import com.my.tracker.obfuscated.u0;

final class v0 implements u0 {
    private final j0 a;
    private final String b;

    public static final class a implements u0.a {
        private final j0 a;
        private final j0.d b;

        public a(j0 j0Var, j0.d dVar) {
            this.a = j0Var;
            this.b = dVar;
        }

        public boolean a() {
            return this.b.a();
        }

        public long b() {
            return this.b.b();
        }

        public long c() {
            return this.b.c();
        }

        public void close() {
            this.b.close();
        }

        public u0.b d() {
            return new b(this.a.e(this.b.c()));
        }

        public String j() {
            return this.b.j();
        }
    }

    public static final class b implements u0.b {
        private final j0.e a;

        public b(j0.e eVar) {
            this.a = eVar;
        }

        public boolean a() {
            return this.a.a();
        }

        public void close() {
            this.a.close();
        }

        public boolean e() {
            return this.a.o();
        }

        public long g() {
            return this.a.n();
        }

        public long i() {
            return this.a.m();
        }
    }

    public v0(j0 j0Var, String str) {
        this.a = j0Var;
        this.b = str;
    }

    public u0.a a() {
        j0 j0Var = this.a;
        return new a(j0Var, j0Var.a(this.b));
    }
}
