DESCRIPTION = "Gtk+ Theme Benchmark Program"
DEPENDS = "gtk+"
HOMEPAGE = "http://wiki.laptop.org/go/GTK_for_OLPC"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://appwindow.c;endline=13;md5=8c09920de460c7ea1f64ee56986aabd9"

SRCREV = "99962ae39bb5aadb31929b25c58e1a053f9c9545"
PV = "0.0.0+git${SRCPV}"

SRC_URI = "git://dev.laptop.org/projects/soc-gtk/"
S = "${WORKDIR}/git/gtk-theme-torturer"

CFLAGS += "-Wl,-rpath-link,${STAGING_LIBDIR}"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 torturer ${D}${bindir}
}


