package Task3;

import Task3.enums.DnsProvider;

public class Task3 {
    public static void main(String[] args) {
        Mapas<DnsProvider,DnsServer> dnsMapas = new Mapas<DnsProvider,DnsServer>();
        dnsMapas.ideti(DnsProvider.GOOGLE, new DnsServer<>("8.8.8.8","8.8.4.4"));
        dnsMapas.ideti(DnsProvider.CLOUDFLARE, new DnsServer<>("1.1.1.1","1.0.0.1"));

        System.out.println(dnsMapas.gauti(DnsProvider.GOOGLE));



        Mapas<String,String> zodynoMapas = new Mapas<String, String>();
        zodynoMapas.ideti("Labas", "Hello");
        System.out.println(zodynoMapas.gauti("Labas"));




    }
}
