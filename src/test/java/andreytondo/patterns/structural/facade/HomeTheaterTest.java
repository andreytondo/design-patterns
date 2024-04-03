package andreytondo.patterns.structural.facade;

import br.com.andreytondo.patterns.structural.facade.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HomeTheaterTest {

    @Test
    public void testWatchMovie() {
        Amplifier mockAmplifier = mock(Amplifier.class);
        DVDPlayer mockDVDPlayer = mock(DVDPlayer.class);
        Projector mockProjector = mock(Projector.class);
        Lights mockLights = mock(Lights.class);

        HomeTheater homeTheater = HomeTheater.builder()
                    .amp(mockAmplifier)
                    .dvdPlayer(mockDVDPlayer)
                    .projector(mockProjector)
                    .lights(mockLights)
                .build();

        String movie = "Inception";
        homeTheater.watchMovie(movie);

        verify(mockAmplifier).on();
        verify(mockDVDPlayer).on();
        verify(mockProjector).on();
        verify(mockLights).dim(50);
        verify(mockProjector).setInput("DVD");
        verify(mockDVDPlayer).play(movie);
    }

    @Test
    public void testEndMovie() {
        Amplifier mockAmplifier = mock(Amplifier.class);
        DVDPlayer mockDVDPlayer = mock(DVDPlayer.class);
        Projector mockProjector = mock(Projector.class);
        Lights mockLights = mock(Lights.class);

        HomeTheater homeTheater = HomeTheater.builder()
                    .amp(mockAmplifier)
                    .dvdPlayer(mockDVDPlayer)
                    .projector(mockProjector)
                    .lights(mockLights)
                .build();

        homeTheater.endMovie();

        verify(mockAmplifier).off();
        verify(mockDVDPlayer).off();
        verify(mockProjector).off();
        verify(mockLights).dim(0);
    }
}
