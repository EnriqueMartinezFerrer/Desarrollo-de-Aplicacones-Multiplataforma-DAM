const leaguesSelect = document.getElementById('leagues');
const seasonsSelect = document.getElementById('seasons');
const tableContainer = document.getElementById('table-container');

// Cargar todas las ligas
fetch('https://www.thesportsdb.com/api/v1/json/3/all_leagues.php')
  .then(response => response.json())
  .then(data => {
    data.leagues.forEach(league => {
      const option = document.createElement('option');
      option.value = league.idLeague;
      option.textContent = league.strLeague;
      leaguesSelect.appendChild(option);
    });
  });

// Cuando se selecciona una liga, cargar todas las temporadas de la liga
leaguesSelect.addEventListener('change', () => {
  const leagueId = leaguesSelect.value;
  fetch(`https://www.thesportsdb.com/api/v1/json/3/search_all_seasons.php?id=${leagueId}`)
    .then(response => response.json())
    .then(data => {
      seasonsSelect.innerHTML = '';
      data.seasons.forEach(season => {
        const option = document.createElement('option');
        option.value = season.strSeason;
        option.textContent = season.strSeason;
        seasonsSelect.appendChild(option);
      });
    });
});

// Cuando se selecciona una temporada, cargar la tabla de dicha temporada
seasonsSelect.addEventListener('change', () => {
  const leagueId = leaguesSelect.value;
  const season = seasonsSelect.value;
  fetch(`https://www.thesportsdb.com/api/v1/json/3/lookuptable.php?l=${leagueId}&s=${season}`)
    .then(response => response.json())
    .then(data => {
      const table = document.createElement('table');
      const thead = document.createElement('thead');
      const tbody = document.createElement('tbody');
      const headerRow = document.createElement('tr');
      const headers = ['Nombre del equipo', 'Puntos', 'Partidos jugados', 'Partidos ganados', 'Partidos empatados', 'Goles a favor', 'Goles en contra'];

      headers.forEach(header => {
        const th = document.createElement('th');
        th.textContent = header;
        headerRow.appendChild(th);
      });

      thead.appendChild(headerRow);
      table.appendChild(thead);

      data.table.forEach(team => {
        const row = document.createElement('tr');
        const cells = [team.strTeam, team.intPoints, team.intPlayed, team.intWin, team.intDraw, team.intGoalsFor, team.intGoalsAgainst];

        cells.forEach(cell => {
          const td = document.createElement('td');
          td.textContent = cell;
          row.appendChild(td);
        });

        tbody.appendChild(row);
      });

      table.appendChild(tbody);
      tableContainer.innerHTML = '';
      tableContainer.appendChild(table);
    });
});