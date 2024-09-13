Obs.: Deixei a explicação comentada em cada Main. Para o exercício 3, a descrição do problema também tá lá comentada. Mas vou deixar aqui também:

Problema: Em uma aplicação, já existe a reprodução de podcast, mas deseja-se implementar, com uso do Padrão Wrapper, a reprodução de um novo formato: podcast com video(videocast).
O método de reprodução atual está na Interface IPodcast:

Void reproduzir(String episodio).

Resolvi criando uma classe AdaptadorPodcast que implementa a Interface do formato já existente(Podcast). O construtor dela recebe um VideoCast e há o método reproduzir, que dado um Episodio, chama o método reproduzir da nova classe "VideoCast".
