package org.example;

public class AdaptadorPodcast implements IPodcast {
    private VideoCast novoFormatoPodcast;

    public AdaptadorPodcast(VideoCast videoCast){
        this.novoFormatoPodcast=videoCast;

    }
    @Override
    public void reproduzir(String episodio) {
            novoFormatoPodcast.reproduzirVideoCast(episodio);
    }
}
