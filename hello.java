///usr/bin/env jbang "$0" "$@" ; exit $?

class hello {
    public static void main(String[] args) {
        System.out.println("Hello " + (args.length > 0 ? args[0] : "World"));
    }
}